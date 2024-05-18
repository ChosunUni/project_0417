<<<<<<< HEAD
package com.suntime.study.repository;

import com.suntime.study.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Repository에서 db로 저장할 때는 entity 객체로 넘겨줘야 한다
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
=======
package com.suntime.study.repository;

import com.suntime.study.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// Repository에서 db로 저장할 때는 entity 객체로 넘겨줘야 한다
public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
    // 이메일로 회원 정보 조회 (select * from member_table where member_email=?
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
>>>>>>> d0cd6e2ceeeb75a71fd1707bb05f98092e3f4db3
