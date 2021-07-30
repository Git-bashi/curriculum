package com.example.security.springsecurity.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GoodsController {
    @Autowired
    GoodsRepository GoodsRepository;

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String index(Model model) {
        List<Goods> goodslist = GoodsRepository.findAll();
        model.addAttribute("goodslist", goodslist);
        return "goods";
    }
}