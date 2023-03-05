package com.qanda.questionboard.member.domain.repository;

import java.util.Optional;

import com.qanda.questionboard.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByGithubId(String githubId);
}