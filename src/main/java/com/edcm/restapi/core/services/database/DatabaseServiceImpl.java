package com.edcm.restapi.core.services.database;

import com.edcm.restapi.core.extension.mappers.StationMapper;
import com.edcm.restapi.core.shared.data.StationSharedData;
import com.edcm.restapi.database.enitites.StationEntity;
import com.edcm.restapi.database.repositories.StationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class DatabaseServiceImpl implements DatabaseService {
    private final StationRepository stationRepository;
    private final StationMapper stationMapper;

    @Override
    public List<StationSharedData> findAllBySystemName(String systemName) {
        return stationRepository.findAllBySystemName(systemName).stream()
            .map(this::toSharedData)
            .collect(Collectors.toList());
    }

    @Override
    public StationSharedData findByStationName(String stationName) {
        StationEntity stationEntity = stationRepository.findByStationName(stationName);
        return toSharedData(stationEntity);
    }

    @Override
    public List<StationSharedData> findCommodityMinBuyPrice(String commodityName, int limit) {
        return stationRepository.findCommodityMinBuyPrice(commodityName, limit).stream()
            .map(this::toSharedData)
            .collect(Collectors.toList());
    }

    private StationSharedData toSharedData(StationEntity entity){
        return stationMapper.toSharedData(entity);
    }
}
