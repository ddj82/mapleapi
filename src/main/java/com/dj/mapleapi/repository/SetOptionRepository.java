package com.dj.mapleapi.repository;

import com.dj.mapleapi.entity.SetOption;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SetOptionRepository extends JpaRepository<SetOption, Long> {
    List<SetOption> findBySetNameOrderBySetCount(String setName);
}