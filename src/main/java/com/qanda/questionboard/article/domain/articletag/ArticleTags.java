package com.qanda.questionboard.article.domain.articletag;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Embeddable
@AllArgsConstructor
public class ArticleTags {

    @OneToMany(mappedBy = "article", orphanRemoval = true, cascade = CascadeType.PERSIST)
    @Column(name = "article_tags")
    private List<ArticleTag> value;

    public ArticleTags() {
        this.value = new ArrayList<>();
    }

//    public void add(Article article, Tags tags) {
//        tags.getTags()
//                .forEach(tag -> value.add(new ArticleTag(article, tag)));
//    }

    public void clear() {
        value.clear();
    }

//    public List<Long> getTagIds() {
//        return value.stream()
//                .map(articleTag -> articleTag.getTag().getId())
//                .collect(Collectors.toList());
//    }
//
//    public List<String> getTagNames() {
//        return value.stream()
//                .map(articleTag -> articleTag.getTag().getName())
//                .collect(Collectors.toList());
//    }
}
