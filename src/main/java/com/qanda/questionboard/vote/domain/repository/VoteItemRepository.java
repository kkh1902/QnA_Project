package com.qanda.questionboard.vote.domain.repository;

import com.qanda.questionboard.vote.domain.VoteItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VoteItemRepository extends JpaRepository<VoteItem, Long>, VoteItemRepositoryCustom {

}
