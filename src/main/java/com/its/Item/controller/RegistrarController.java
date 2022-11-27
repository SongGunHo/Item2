package com.its.Item.controller;

import com.its.Item.dto.RegistrarDTO;
import com.its.Item.service.RegistrarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/registrar")
public class RegistrarController {
    @Autowired
    RegistrarService registrarService;
    @GetMapping("/save-form")
    public String saveForm(){
        return "/registrarPages/save";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute RegistrarDTO registrarDTO){
        RegistrarDTO save = registrarService.save(registrarDTO);
        return "/registrarPages/list";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<RegistrarDTO> registrarDTOS = registrarService.findAll();
        model.addAttribute("all",registrarDTOS);
        return "/registrarPages/list";
    }
    @GetMapping("/detail")
    public String detail(@PathVariable("id")Long id ,Model model){
        RegistrarDTO byId = registrarService.findById(id);
        model.addAttribute("byId",byId);
        return "/registrarPages/detail";
    }
    @PostMapping("update-form")
    public String updateForm(@PathVariable("id")Long id,Model model){
        RegistrarDTO byId = registrarService.findById(id);
        return "/registrarPages/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute RegistrarDTO registrarDTO){
        int update = registrarService.update(registrarDTO);
        return "memberPages/mypage";
    }
    @GetMapping("/deleta")
    public String deleta(@PathVariable("id")Long id){
        registrarService.deleta(id);
        return "memberPages/index";
    }
}
