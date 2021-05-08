package com.edcm.restapi.api.controllers;

import com.edcm.restapi.api.requests.WishlistCommodityRequest;
import com.edcm.restapi.api.responses.WishlistResponse;
import com.edcm.restapi.core.extension.mappers.WishlistMapper;
import com.edcm.restapi.core.services.database.WishlistService;
import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class WishlistController {
    public final WishlistMapper mapper;
    private final WishlistService wishlistService;

    @GetMapping("/wishlist/{commodityName}")
    @ResponseBody
    public WishlistResponse getAllWishlistCommodities(@PathVariable String commodityName) {
        List<WishlistItemSharedData> responseItems = wishlistService.getWishistCommoditiesByName(commodityName);
        return new WishlistResponse(responseItems);
    }

    @PostMapping("/wishlist/{commodityId}")
    public void duplicateWishlistCommodity(@PathVariable String commodityId) {
        wishlistService.duplicateCommodityById(commodityId);
    }

    @PostMapping("/wishlist")
    public void createWishlistCommodity(@RequestBody WishlistCommodityRequest request) {
        WishlistItemSharedData wishlistItemSharedData = new WishlistItemSharedData(
            request.buyPrice,
            request.sellPrice,
            request.name);

        wishlistService.saveCommodity(mapper.toCommodtityEntity(wishlistItemSharedData));
    }
}
