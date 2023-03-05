package com.qanda.questionboard.article.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Embeddable
public class Content {

    @Column(name = "content", nullable = false, columnDefinition = "text")
    private String value;

//    public Content(String value) {
//        validateNull(value);
//        this.value = value;
//    }

//    private void validateNull(String value) {
//        if (Objects.isNull(value)) {
//            throw new ArticleContentNullException();
//        }
//    }
}
