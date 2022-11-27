package com.its.Item.controller;

import com.its.Item.dto.MemberDTO;
import com.its.Item.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MemberController {
    @Autowired
    MemberService memberService;
    @GetMapping("/save-form")
    public String saveForm(){
        return "memberPages/save";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        boolean save = memberService.save(memberDTO);
        if(save){
            return "memberPages/login";
        }else {
            return "memberPages/save";
        }

    }
    @GetMapping("/login-form")
    public String loginForm(){

        return "memberPages/login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO login = memberService.login(memberDTO);
    if(login!=null){
        session.setAttribute("login",login.getMemberId());
        session.setAttribute("loginMember",login);
        return "memberPages/main";
    }else {
        return "memberPages/login";
    }
    }
    @GetMapping("/update-form")
    public String updateForm(@RequestParam("id")Long id , Model model){
        MemberDTO byId = memberService.findById(id);
        model.addAttribute("byId",byId);
        return "memberPages/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute MemberDTO memberDTO,Model model){
        int update = memberService.update(memberDTO);
        model.addAttribute("date",update);
        MemberDTO byId = memberService.findById(memberDTO.getId());
        model.addAttribute("member",update);
        return "memberPages/main";
    }
    @GetMapping("/myPage-form")
    public String myPageForm(){
        return "memberPages/mypage";
    }
    @PostMapping("/myPage")
    public String myPage(@PathVariable("id")Long id ){
        MemberDTO byId = memberService.findById(id);
        return "memberPages/main";
    }
    @GetMapping("/detail")
    public String detail(@PathVariable("id")Long id,Model model){
        MemberDTO byId = memberService.findById(id);
        model.addAttribute("byId",byId);
        return "memberPages/detail";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "memberPages/index";
    }
    @GetMapping("/delete")
    public String delete(@PathVariable("id")Long id){
        memberService.delete(id);
        return "memberPages/index";
    }
    @GetMapping("/list-form")
    public String list(@ModelAttribute MemberDTO memberDTO ,Model model){
        List<MemberDTO> all = memberService.findAll(memberDTO);
        model.addAttribute("all",all);
        return "/memberPages/list";
    }
    @PostMapping("id-Check")
    public @ResponseBody String idCheck(@RequestParam("memberId")String memberId){
        String result = memberService.idCheck(memberId);
        return "result";
    }
}

