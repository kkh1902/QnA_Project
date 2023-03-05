package com.qanda.questionboard.like.domain.repository;

import com.qanda.questionboard.like.domain.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {

    void deleteByArticleIdAndMemberId(Long articleId, Long memberId);

    boolean existsByArticleIdAndMemberId(Long articleId, Long memberId);

    Long countByArticleId(Long articleId);

    void deleteAllByArticleId(Long articleId);
}
