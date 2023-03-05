package com.qanda.questionboard.member.domain;


import java.util.Objects;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Embeddable
public class Name {

    private static final int MIN_NAME_LENGTH = 1;
    public static final int MAX_NAME_LENGTH = 255;

    @Column(name = "name", nullable = false)
    private String value;

//    public Name(String value) {
//        validateNullOrEmpty(value);
//        validateLength(value);
//        this.value = value;
//    }

//    private void validateNullOrEmpty(String value) {
//        if (Objects.isNull(value) || value.trim().length() < MIN_NAME_LENGTH) {
//            throw new NameNullOrEmptyException();
//        }
//    }
//
//    private void validateLength(String value) {
//        if (value.length() > MAX_NAME_LENGTH) {
//            throw new NameTooLongException();
//        }
//    }
}