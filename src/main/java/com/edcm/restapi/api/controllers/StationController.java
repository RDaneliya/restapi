package com.edcm.restapi.api.controllers;

import com.edcm.restapi.api.items.StationResponseItem;
import com.edcm.restapi.api.responses.StationResponse;
import com.edcm.restapi.core.extension.mappers.StationMapper;
import com.edcm.restapi.core.services.database.StationService;
import com.edcm.restapi.core.shared.data.StationSharedData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StationController {
    private final StationService stationService;
    private final StationMapper stationMapper;

    @GetMapping("/station/{stationName}")
    @ResponseBody
    public StationResponseItem getStationInfoByName(@PathVariable String stationName) {
        StationSharedData stationSharedData = stationService.findByStationName(stationName);
        return toResponse(stationSharedData);
    }

    @GetMapping("/stations")
    @ResponseBody
    public StationResponse getStationsInSystem(@RequestParam String systemName) {
        List<StationResponseItem> responseItems = stationService.findAllBySystemName(systemName).stream()
            .map(this::toResponse)
            .collect(Collectors.toList());

        return new StationResponse(responseItems);
    }

    private StationResponseItem toResponse(StationSharedData stationSharedData) {
        return stationMapper.toResponseItem(stationSharedData);
    }
}
