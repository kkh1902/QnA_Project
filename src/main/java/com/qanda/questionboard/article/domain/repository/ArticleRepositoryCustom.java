package com.qanda.questionboard.article.domain.repository;

import com.qanda.questionboard.article.domain.repository.dto.MyPagePreviewDto;

import java.util.List;

public interface ArticleRepositoryCustom {

    List<MyPagePreviewDto> findAllByMemberIdWithCommentCount(Long memberId);
}
