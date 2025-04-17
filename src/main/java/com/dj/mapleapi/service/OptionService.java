package com.dj.mapleapi.service;

import com.dj.mapleapi.dto.SetInfoDto;
import com.dj.mapleapi.entity.SetOption;
import com.dj.mapleapi.entity.StarforceOption;
import com.dj.mapleapi.repository.SetOptionRepository;
import com.dj.mapleapi.repository.StarforceOptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final SetOptionRepository setOptionRepository;
    private final StarforceOptionRepository starforceOptionRepository;

    public List<SetOption> getSetOptionsBySetName(String setName) {
        return setOptionRepository.findBySetNameOrderBySetCount(setName);
    }

    public List<StarforceOption> getStarforceOptionsBySetName(String setName) {
        return starforceOptionRepository.findBySetNameOrderByStarforce(setName);
    }

    public SetInfoDto getFullSetInfo(String setName) {
        List<SetOption> setOptions = setOptionRepository.findBySetNameOrderBySetCount(setName);
        List<StarforceOption> starforceOptions = starforceOptionRepository.findBySetNameOrderByStarforce(setName);
        return SetInfoDto.builder()
                .setOptions(setOptions)
                .starforceOptions(starforceOptions)
                .build();
    }
}
