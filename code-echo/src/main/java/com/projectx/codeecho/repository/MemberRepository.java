package com.projectx.codeecho.repository;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.projectx.codeecho.domain.entity.Member;
import org.springframework.stereotype.Repository;

import java.util.UUID;


public interface MemberRepository extends JpaRepository<Member,String> {
    Member findByName(String name);
    Page<Member> findByName(String name, Pageable pageable);

    Member findByAccount(String account);
    Page<Member> findByAccount(String account, Pageable pageable);

    Member findByNickname(String nickname);
    Page<Member> findByNickname(String nickname, Pageable pageable);

    //Member findByUUID(UUID uuid);
    //Page<Member> findByUUID(UUID uuid, Pageable pageable);

    Member findByNameAndAccount(String name, String account);
    Member findByAccountAndNickname(String account, String nickname);
}
