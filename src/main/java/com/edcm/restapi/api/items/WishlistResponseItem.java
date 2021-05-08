package com.edcm.restapi.api.items;

import lombok.Data;

@Data
public class WishlistResponseItem {
    public int buyPrice;

    public int sellPrice;

    public String name;
}
