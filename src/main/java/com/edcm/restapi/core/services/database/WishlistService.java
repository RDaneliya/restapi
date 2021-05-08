package com.edcm.restapi.core.services.database;

import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import com.edcm.restapi.database.enitites.WishlistCommodityEntity;

import java.util.List;

public interface WishlistService {
    List<WishlistItemSharedData> getWishistCommoditiesByName(String commodityName);

    void duplicateCommodityById(String id);

    void saveCommodity(WishlistCommodityEntity prototype);
}
