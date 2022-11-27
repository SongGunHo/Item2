package com.its.Item.service;

import com.its.Item.dto.MemberDTO;
import com.its.Item.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public boolean save(MemberDTO memberDTO) {
        int save = memberRepository.save(memberDTO);
        if (save > 0) {
            return true;
        } else {
            return false;
        }
    }

    public MemberDTO login(MemberDTO memberDTO) {
        MemberDTO l = memberRepository.login(memberDTO);
        return l;
    }

    public MemberDTO findById(Long id) {
        MemberDTO by = memberRepository.findBy(id);
        return by;
    }

    public int update(MemberDTO memberDTO) {
        int p = memberRepository.update(memberDTO);
        return p;
    }

    public void delete(Long id) {
        memberRepository.delete(id);
    }

    public List<MemberDTO> findAll(MemberDTO memberDTO) {
        List<MemberDTO> all = memberRepository.findAll(memberDTO);
        return all;
    }

    public String idCheck(String memberId) {
        String s = memberRepository.idCheck(memberId);
        if(s== null){
            return "ok";
        }else {
            return "no";
        }
    }
}