package com.example.reactmapping.repository;

import com.example.reactmapping.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member>findMemberByEmailId(String emailId);
    Optional<Member>findMemberById(Long id);
}
