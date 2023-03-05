package com.qanda.questionboard.vote.domain.repository;

import com.qanda.questionboard.vote.domain.VoteHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteHistoryRepository extends JpaRepository<VoteHistory, Long>, VoteHistoryRepositoryCustom {

}
