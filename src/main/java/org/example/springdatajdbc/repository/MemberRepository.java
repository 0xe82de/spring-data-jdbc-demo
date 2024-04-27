package org.example.springdatajdbc.repository;

import org.example.springdatajdbc.entity.Member;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MemberRepository extends CrudRepository<Member, Long> {

    @Override
    List<Member> findAll();

    Optional<Member> findBySeq(Long seq);

    List<Member> findByName(String name);
}
