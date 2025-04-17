package com.dj.mapleapi.controller;

import com.dj.mapleapi.dto.SetInfoDto;
import com.dj.mapleapi.entity.SetOption;
import com.dj.mapleapi.entity.StarforceOption;
import com.dj.mapleapi.service.OptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/options")
@RequiredArgsConstructor
public class OptionController {

    private final OptionService optionService;

    @GetMapping("/{setName}/set")
    public List<SetOption> getSetOptions(@PathVariable String setName) {
        return optionService.getSetOptionsBySetName(setName);
    }

    @GetMapping("/{setName}/starforce")
    public List<StarforceOption> getStarforceOptions(@PathVariable String setName) {
        return optionService.getStarforceOptionsBySetName(setName);
    }

    @GetMapping("/{setName}")
    public SetInfoDto getFullSetInfo(@PathVariable String setName) {
        return optionService.getFullSetInfo(setName);
    }

}
