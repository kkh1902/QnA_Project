package com.qanda.questionboard.article.domain.repository;

import com.qanda.questionboard.article.domain.TempArticle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TempArticleRepository extends JpaRepository<TempArticle, Long> {

    @Query("select ta from TempArticle ta join fetch ta.member where ta.id = :id")
    Optional<TempArticle> findByIdWithMember(@Param("id") Long id);

    List<TempArticle> findAllByMemberId(Long id);

    Optional<TempArticle> findByIdAndMemberId(Long tempArticleId, Long memberId);
}
