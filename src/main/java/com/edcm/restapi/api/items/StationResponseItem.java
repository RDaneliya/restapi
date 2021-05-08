package com.edcm.restapi.api.items;

import lombok.Data;

import java.time.Instant;

@Data
public class StationResponseItem {
    public String stationName;

    public String systemName;

    public String[] prohibited;

    public CommodityResponseItem[] commodities;

    public EconomyResponseItem[] economies;

    public Instant timestamp;
}
