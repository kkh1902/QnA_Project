package com.qanda.questionboard.article.domain;

import com.qanda.questionboard.article.domain.articletag.ArticleTags;
import com.qanda.questionboard.common.domain.BaseTimeEntity;
import com.qanda.questionboard.member.domain.Member;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Getter
@Entity
public class Article extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Title title;

    @Embedded
    private Content content;

    @Enumerated(value = EnumType.STRING)
    @Column(nullable = false)
    private Category category;

    @OnDelete(action = OnDeleteAction.CASCADE)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Embedded
    private ArticleTags articleTags;

    @Column(nullable = false)
    private boolean isAnonymous;

    @Embedded
    private Views views;

    @Embedded
    private LikeCount likeCount;

//    public Article(String title, String content, Category category, Member member, boolean isAnonymous) {
//        this(
//                null,
//                new Title(title),
//                new Content(content),
//                category,
//                member,
//                new ArticleTags(),
//                isAnonymous,
//                new Views(),
//                new LikeCount()
//        );
//    }
//
//    public boolean isAuthor(Member member) {
//        return this.member.equals(member);
//    }
//
//    public void addViews() {
//        views.addValue();
//    }
//
//    public void update(String title, String content, Tags tags) {
//        this.title = new Title(title);
//        this.content = new Content(content);
//        articleTags.clear();
//        addTag(tags);
//    }
//
//    public void addTag(Tags tags) {
//        articleTags.add(this, tags);
//    }
//
//    public boolean cannotCreateVote() {
//        return !Category.DISCUSSION.equals(this.category);
//    }
//
//    public String getTitle() {
//        return title.getValue();
//    }
//
//    public String getContent() {
//        return content.getValue();
//    }
//
//    public Member getMember() {
//        return member.getMemberOrAnonymous(isAnonymous);
//    }
//
//    public long getViews() {
//        return views.getValue();
//    }
//
//    public long getLikeCount() {
//        return likeCount.getValue();
//    }
//
//    public List<Long> getTagIds() {
//        return this.articleTags.getTagIds();
//    }
//
//    public List<String> getTagNames() {
//        return this.articleTags.getTagNames();
//    }
}
