package com.edcm.restapi.database.repositories;

import com.edcm.restapi.database.enitites.StationEntity;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StationRepository extends MongoRepository<StationEntity, String> {
    List<StationEntity> findAllBySystemName(String systemName);

    StationEntity findByStationName(String stationName);

    @Aggregation(pipeline = {"{ '$match': { 'commodities.name': { '$regex': '^$?0$'} } }, { '$unwind': { 'path': '$commodities', 'preserveNullAndEmptyArrays': false } }, { '$match': { 'commodities.name': { '$regex': '^$?0$' }, 'commodities.buyPrice': { '$gt': 0 } } }, { '$sort': { 'commodities.buyPrice': 1 } }, { '$limit': '$?1' }"})
    List<StationEntity> findCommodityMinBuyPrice(String commodityName, int limit);

}
