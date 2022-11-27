package com.its.Item.repository;

import com.its.Item.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.reflect.Member;
import java.util.List;

@Repository
public class MemberRepository {
    @Autowired
    SqlSessionTemplate sql;

    public int save(MemberDTO memberDTO) {
        return sql.insert("Member.save", memberDTO);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        return  sql.selectOne("Member.login",memberDTO);
    }

    public MemberDTO findBy(Long id) {
        return sql.selectOne("Member.findById",id);
    }

    public int update(MemberDTO memberDTO) {
        return sql.update("Member.update",memberDTO);
    }

    public void delete(Long id) {

        sql.selectOne("Member.delete",id);
    }

    public List<MemberDTO> findAll(MemberDTO memberDTO) {
        return sql.selectList("Member.list",memberDTO);
    }

    public String idCheck(String memberId) {
        return sql.selectOne("Member.idCheck",memberId);

    }
}