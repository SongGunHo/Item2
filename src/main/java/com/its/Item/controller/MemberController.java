package com.its.Item.controller;

import com.its.Item.dto.MemberDTO;
import com.its.Item.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/save-form")
    public String saveForm(){
        return "save";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        boolean save = memberService.save(memberDTO);
        if(save){
            return "longin";
        }else {
            return "save";
        }

    }
    @GetMapping("/login-form")
    public String loginForm(){
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        memberService.login(memberDTO);

    }
}

