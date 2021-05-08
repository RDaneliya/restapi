package com.edcm.restapi.core.services.database;

import com.edcm.restapi.core.extension.mappers.WishlistMapper;
import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import com.edcm.restapi.database.enitites.WishlistCommodityEntity;
import com.edcm.restapi.database.repositories.WishlistRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class WishlistServiceImpl implements WishlistService {
    private final WishlistRepository repository;
    private final WishlistMapper mapper;

    @Override
    public List<WishlistItemSharedData> getWishistCommoditiesByName(String commodityName) {
        return repository.getAllByName(commodityName).stream()
            .map(mapper::toSharedData)
            .collect(Collectors.toList());
    }

    @Override
    public void duplicateCommodityById(String id) {
        WishlistCommodityEntity duplicate = (WishlistCommodityEntity) repository.getFirstById(id).duplicate();
        repository.save(duplicate);
    }

    @Override
    public void saveCommodity(WishlistCommodityEntity prototype) {
        repository.save(prototype);
    }


}
