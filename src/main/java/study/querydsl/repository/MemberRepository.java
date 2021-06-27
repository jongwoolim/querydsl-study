package study.querydsl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import study.querydsl.entity.Member;

import java.util.List;

// QuerydslPredicateExecutor 조인 x, 클라이언트가 querydsl에 의존... 따라서 복잡한 실무에서는 권장x
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {

    List<Member> findByUsername(String username);
}
