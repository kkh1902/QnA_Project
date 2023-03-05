package com.qanda.questionboard.article.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Views {

    private static final int INITIAL_VIEWS = 0;

    @Column(name = "views", nullable = false)
    private long value;

    public Views() {
        this.value = INITIAL_VIEWS;
    }

    public void addValue() {
        value++;
    }
}
