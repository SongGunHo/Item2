package com.its.Item.repository;

import com.its.Item.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;

@Repository
public class MemberRepository {
    @Autowired
    SqlSessionTemplate sql;
    public int save(MemberDTO memberDTO) {


    }

    public MemberDTO login(MemberDTO memberDTO) {
    }
}
