package com.dj.mapleapi.repository;

import com.dj.mapleapi.entity.StarforceOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StarforceOptionRepository extends JpaRepository<StarforceOption, Long> {
    List<StarforceOption> findBySetNameOrderByStarforce(String setName);
}