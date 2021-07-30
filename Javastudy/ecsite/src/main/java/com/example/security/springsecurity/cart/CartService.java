package com.example.security.springsecurity.cart;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public List<Cart> findAll() {
        return cartRepository.findAll();
    }

    public void insert(Cart cart) {
    	cartRepository.save(cart);
    }

    public void delete(Integer id) {
    	cartRepository.deleteById(id);
    }

    public Optional<Cart> selectById(Integer id) {
        return cartRepository.findById(id);
    }
}
