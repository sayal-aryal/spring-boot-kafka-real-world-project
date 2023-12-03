package com.practice.springboot.repository;


import com.practice.springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepository extends JpaRepository<WikimediaData, Long> {

}
