package com.qanda.questionboard.vote.domain.repository;

import com.qanda.questionboard.vote.domain.VoteHistory;

import java.util.List;
import java.util.Optional;

public interface VoteHistoryRepositoryCustom {

    Optional<VoteHistory> findByVoteItemIdsAndMemberId(List<Long> voteItemIds, Long memberId);

    Optional<VoteHistory> findByVoteIdInAndMemberId(Long voteItemId, Long memberId);
}
