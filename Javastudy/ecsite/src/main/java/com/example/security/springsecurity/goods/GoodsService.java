package com.example.security.springsecurity.goods;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GoodsService{

  @Autowired
  GoodsRepository GoodsRepository;

  public List<Goods> findAll(){
	    return GoodsRepository.findAll();
}
}