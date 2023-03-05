package com.qanda.questionboard.vote.domain.repository;

import com.qanda.questionboard.vote.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {

    boolean existsByArticleId(Long articleId);

    Optional<Vote> findByArticleId(Long articleId);
}
