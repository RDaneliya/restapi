package com.edcm.restapi.api.stations;

import com.edcm.restapi.core.extension.mappers.StationMapper;
import com.edcm.restapi.core.services.database.DatabaseService;
import com.edcm.restapi.core.shared.data.StationSharedData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class StationController {
    private final DatabaseService databaseService;
    private final StationMapper stationMapper;

    @GetMapping("/station/{stationName}")
    @ResponseBody
    public StationResponse getStationInfoByName(@PathVariable String stationName) {
        StationSharedData stationSharedData = databaseService.findByStationName(stationName);
        return toResponse(stationSharedData);
    }

    private StationResponse toResponse(StationSharedData stationSharedData) {
        return stationMapper.toResponseItem(stationSharedData);
    }
}
