package com.dj.mapleapi.dto;

import com.dj.mapleapi.entity.SetOption;
import com.dj.mapleapi.entity.StarforceOption;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class SetInfoDto {
    private List<SetOption> setOptions;
    private List<StarforceOption> starforceOptions;
}