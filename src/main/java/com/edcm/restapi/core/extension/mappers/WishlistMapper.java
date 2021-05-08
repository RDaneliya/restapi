package com.edcm.restapi.core.extension.mappers;

import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import com.edcm.restapi.database.enitites.WishlistCommodityEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface WishlistMapper {
    WishlistItemSharedData toSharedData(WishlistCommodityEntity entity);

    @Mapping(target = "id", ignore = true)
    WishlistCommodityEntity toCommodtityEntity(WishlistItemSharedData sharedData);
}
