package com.edcm.restapi.api.requests;

import lombok.NonNull;
import lombok.Setter;

public class WishlistCommodityRequest {
    @Setter
    public int buyPrice;

    @Setter
    public int sellPrice;

    @Setter
    @NonNull
    public String name;
}
