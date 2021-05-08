package com.edcm.restapi.core.extension.mappers;

import com.edcm.restapi.api.items.WishlistResponseItem;
import com.edcm.restapi.api.requests.WishlistCommodityRequest;
import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import com.edcm.restapi.database.enitites.WishlistCommodityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WishlistMapper {
    WishlistItemSharedData toSharedData(WishlistCommodityEntity entity);

    WishlistResponseItem toResponseItem(WishlistItemSharedData sharedData);

    WishlistItemSharedData toSharedData(WishlistCommodityRequest sharedData);

    @Mapping(target = "id", ignore = true)
    WishlistCommodityEntity toCommodtityEntity(WishlistItemSharedData sharedData);
}
