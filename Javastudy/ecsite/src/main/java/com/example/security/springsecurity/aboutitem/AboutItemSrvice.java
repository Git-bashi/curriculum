package com.example.security.springsecurity.aboutitem;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AboutItemService {
	@Autowired
	AboutItemRepository aboutItemRepository;

	public Optional<AboutItem> selectById(Integer id) {
	       return AboutItemRepository.findById(id);
}