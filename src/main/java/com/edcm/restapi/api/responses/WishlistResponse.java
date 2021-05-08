package com.edcm.restapi.api.responses;

import com.edcm.restapi.core.shared.data.WishlistItemSharedData;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class WishlistResponse {
    List<WishlistItemSharedData> wishlist;
}
