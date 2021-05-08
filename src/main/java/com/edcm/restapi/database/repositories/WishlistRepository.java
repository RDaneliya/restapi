package com.edcm.restapi.database.repositories;

import com.edcm.restapi.database.enitites.WishlistCommodityEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WishlistRepository extends MongoRepository<WishlistCommodityEntity, String> {
    List<WishlistCommodityEntity> getAllByName(String commodityName);
    WishlistCommodityEntity getFirstById(String id);
}
