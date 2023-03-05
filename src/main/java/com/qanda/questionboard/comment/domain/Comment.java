package com.qanda.questionboard.comment.domain;


import com.qanda.questionboard.article.domain.Article;
import com.qanda.questionboard.common.domain.BaseTimeEntity;
import com.qanda.questionboard.member.domain.Member;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Comment extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Content content;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "article_id", nullable = false)
    private Article article;

    @Column(nullable = false)
    private boolean isAnonymous;

//    public Comment(String content, Member member, Article article, boolean isAnonymous) {
//        this.content = new Content(content);
//        this.member = member;
//        this.article = article;
//        this.isAnonymous = isAnonymous;
//    }
//
//    public void updateContent(String content) {
//        this.content = new Content(content);
//    }
//
//    public boolean isAuthor(Member member) {
//        return this.member.equals(member);
//    }
//
//    public String getContent() {
//        return content.getValue();
//    }
//
//    public Member getMember() {
//        return member.getMemberOrAnonymous(isAnonymous);
//    }
}
