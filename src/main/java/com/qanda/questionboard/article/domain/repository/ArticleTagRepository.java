package com.qanda.questionboard.article.domain.repository;

public interface ArticleTagRepository {

    boolean existsArticleByTagId(Long tagId);
}
