package com.edcm.restapi.core.shared.data;

import lombok.Data;

import java.time.Instant;

@Data
public class StationSharedData {
    public String stationName;

    public String systemName;

    public String[] prohibited;

    public CommoditySharedData[] commodities;

    public EconomySharedData[] economies;

    public Instant timestamp;
}
