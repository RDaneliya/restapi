package com.edcm.restapi.core.shared.data;

import lombok.Data;

@Data
public class CommoditySharedData {
    public int buyPrice;

    public int sellPrice;

    public int stock;

    public int demand;

    public String category;

    public String name;
}
