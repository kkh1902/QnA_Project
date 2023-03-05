package com.qanda.questionboard.article.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
@Getter
public class Title {

    private static final int MIN_TITLE_LENGTH = 1;
    private static final int MAX_TITLE_LENGTH = 500;

    @Column(name = "title", nullable = false, length = MAX_TITLE_LENGTH)
    private String value;

//    public Title(String value) {
//        validateNullOrEmpty(value);
//        validateLength(value);
//        this.value = value;
//    }

//    private void validateNullOrEmpty(String value) {
//        if (Objects.isNull(value) || value.trim().length() < MIN_TITLE_LENGTH) {
//            throw new ArticleTitleNullOrEmptyException();
//        }
//    }
//
//    private void validateLength(String value) {
//        if (value.length() > MAX_TITLE_LENGTH) {
//            throw new ArticleTitleTooLongException(value.length());
//        }
//    }
}
