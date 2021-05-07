package com.edcm.restapi.api.stations;

import lombok.Data;

@Data
public class CommodityResponseItem {
    public int buyPrice;

    public int sellPrice;

    public int stock;

    public int demand;

    public String category;

    public String name;
}
