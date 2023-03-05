//package com.qanda.questionboard.vote.domain.repository;
//
//import com.qanda.questionboard.vote.domain.VoteHistory;
//import com.querydsl.jpa.impl.JPAQueryFactory;
//import lombok.RequiredArgsConstructor;
//
//import java.util.List;
//import java.util.Optional;
//
//import static com.woowacourse.gongseek.vote.domain.QVote.vote;
//import static com.woowacourse.gongseek.vote.domain.QVoteHistory.voteHistory;
//import static com.woowacourse.gongseek.vote.domain.QVoteItem.voteItem;
//
//@RequiredArgsConstructor
//public class VoteHistoryRepositoryImpl implements VoteHistoryRepositoryCustom {
//
//    private final JPAQueryFactory queryFactory;
//
//    public Optional<VoteHistory> findByVoteItemIdsAndMemberId(List<Long> voteItemIds, Long memberId) {
//        return Optional.ofNullable(queryFactory
//                .selectFrom(voteHistory)
//                .where(
//                        voteHistory.voteItem.id.in(voteItemIds)
//                                .and(voteHistory.member.id.eq(memberId))
//                )
//                .fetchFirst());
//    }
//
//    @Override
//    public Optional<VoteHistory> findByVoteIdInAndMemberId(Long voteId, Long memberId) {
//        return Optional.ofNullable(queryFactory
//                .selectFrom(voteHistory)
//                .join(voteHistory.voteItem, voteItem).fetchJoin()
//                .join(voteItem.vote, vote).fetchJoin()
//                .where(
//                        voteItem.vote.id.eq(voteId)
//                                .and(voteHistory.member.id.eq(memberId))
//                )
//                .fetchFirst());
//    }
//}
