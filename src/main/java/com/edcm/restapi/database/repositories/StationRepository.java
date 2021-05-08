package com.edcm.restapi.database.repositories;

import com.edcm.restapi.database.enitites.StationEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends MongoRepository<StationEntity, String> {
    List<StationEntity> findAllBySystemName(String systemName);

    StationEntity findByStationName(String stationName);
}
