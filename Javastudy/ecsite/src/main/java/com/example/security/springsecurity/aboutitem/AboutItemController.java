package com.example.security.springsecurity.aboutitem;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutItemController {
    @Autowired
    AboutItemRepository aboutItemRepository;
    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String index(Model model) {
        List<AboutItem> aboutItemList = aboutItemRepository.findbyId();
        model.addAttribute("aboutItemlist", aboutItemList);
        return "aboutItem";
    }
}