package com.yale.bamboo.service;

import com.yale.bamboo.domain.dto.JpaTest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface H2Service extends JpaRepository<JpaTest,Integer> {

}
