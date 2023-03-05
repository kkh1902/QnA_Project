package com.qanda.questionboard.tag.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Tag {

    private static final int MIN_NAME_LENGTH = 2;
    private static final int MAX_NAME_LENGTH = 20;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true, nullable = false, length = MAX_NAME_LENGTH)
    private String name;

//    public Tag(String name) {
//        validateNullOrBlank(name);
//        validateLength(name);
//        this.name = name.trim().toUpperCase();
//    }

//    private void validateNullOrBlank(String name) {
//        if (Objects.isNull(name) || name.isBlank()) {
//            throw new TagNameNullOrBlankException();
//        }
//    }
//
//    private void validateLength(String name) {
//        if (name.length() < MIN_NAME_LENGTH || name.length() > MAX_NAME_LENGTH) {
//            throw new TagNameLengthException();
//        }
//    }
}
