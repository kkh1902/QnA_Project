package com.qanda.questionboard.vote.domain;

import com.qanda.questionboard.article.domain.Article;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@EntityListeners(AuditingEntityListener.class)
@Entity
public class Vote {

    private static final int MAX_VOTE_PERIOD = 7;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime expiryAt;

//    public Vote(Article article, LocalDateTime expiryAt) {
//        this(null, article, LocalDateTime.now(), expiryAt);
//    }

//    public Vote(Long id, Article article, LocalDateTime createdAt, LocalDateTime expiryAt) {
//        validateNull(expiryAt);
//        validateExpiryDate(createdAt, expiryAt);
//        this.id = id;
//        this.article = article;
//        this.createdAt = createdAt;
//        this.expiryAt = expiryAt;
//    }

//    private void validateNull(LocalDateTime expiryAt) {
//        if (Objects.isNull(expiryAt)) {
//            throw new InvalidVoteExpiryDateException();
//        }
//    }
//
//    private void validateExpiryDate(LocalDateTime createdAt, LocalDateTime expiryAt) {
//        if (createdAt.isAfter(expiryAt) || expiryAt.isAfter(createdAt.plusDays(MAX_VOTE_PERIOD))) {
//            throw new InvalidVoteExpiryDateException();
//        }
//    }

    public boolean isExpired() {
        return expiryAt.isBefore(LocalDateTime.now());
    }
}
