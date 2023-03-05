package com.qanda.questionboard.article.domain;

import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@Getter
public class LikeCount {

    private static final int INITIAL_VIEWS = 0;

    @Column(name = "like_count", nullable = false)
    private long value;

    public LikeCount() {
        this.value = INITIAL_VIEWS;
    }

    public void addValue() {
        value++;
    }

    public void minusValue() {
        value--;
    }
}
