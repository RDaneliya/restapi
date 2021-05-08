package com.edcm.restapi.core.services.database;

import com.edcm.restapi.core.shared.data.StationSharedData;

import java.util.List;

public interface StationService {
    List<StationSharedData> findAllBySystemName(String systemName);

    StationSharedData findByStationName(String stationName);
}
