package com.example.security.springsecurity.cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class CartController {

    @Autowired
    CartRepository cartRepository;

    @PostMapping("/aboutItem")
	public String registration(Model model) {

    	Cart newCart = new Cart();
    	newCart.setId(newCart.getId());
    	newCart.setName(newCart.getName());
    	newCart.setPrice(newCart.getPrice());
    	newCart.setSize(newCart.getSize());
    	newCart.setColor(newCart.getColor());
    	newCart.setUsername(newCart.getUsername());
    	newCart.setLast_name(newCart.getLast_name());
    	newCart.setFirst_name(newCart.getFirst_name());

		cartRepository.insert(newCart);
		return "/cart";
    }

    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String index(Model model) {
        List<Cart> cartlist=cartRepository.findAll();
        model.addAttribute("cartlist", cartlist);
        return "/*カートURL*/";
    }
}
