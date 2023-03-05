package com.qanda.questionboard.vote.domain.repository;

import com.qanda.questionboard.vote.domain.repository.dto.VoteItemDto;

import java.util.List;

public interface VoteItemRepositoryCustom {

    List<VoteItemDto> findAllByArticleIdWithCount(Long articleId);
}
