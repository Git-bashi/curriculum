package com.example.security.springsecurity.aboutitem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutItemRepository extends JpaRepository<AboutItem, String> {
}