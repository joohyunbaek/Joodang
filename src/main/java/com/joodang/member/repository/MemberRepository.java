package com.joodang.member.repository;

import com.joodang.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
    Member findByEmail(String email) ; // 회원 가입시 중복체크
}
