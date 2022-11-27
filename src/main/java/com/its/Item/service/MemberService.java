package com.its.Item.service;

import com.its.Item.dto.MemberDTO;
import com.its.Item.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;

    public boolean save(MemberDTO memberDTO) {
        int save = memberRepository.save(memberDTO);
        if(save>0){
            return true;
        }else {
            return false;
        }
    }

    public MemberDTO login(MemberDTO memberDTO) {
        memberRepository.login(memberDTO);
    }
}
