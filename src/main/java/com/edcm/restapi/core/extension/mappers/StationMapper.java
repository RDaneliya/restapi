package com.edcm.restapi.core.extension.mappers;

import com.edcm.restapi.api.stations.StationResponse;
import com.edcm.restapi.core.shared.data.StationSharedData;
import com.edcm.restapi.database.enitites.StationEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StationMapper {
    StationSharedData toSharedData(StationEntity entity);

    StationResponse toResponseItem(StationSharedData stationSharedData);
}
