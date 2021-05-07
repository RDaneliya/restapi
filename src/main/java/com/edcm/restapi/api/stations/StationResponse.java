package com.edcm.restapi.api.stations;

import lombok.Data;

import java.time.Instant;

@Data
public class StationResponse {
    public String stationName;

    public String systemName;

    public String[] prohibited;

    public CommodityResponseItem[] commodities;

    public EconomyResponseItem[] economies;

    public Instant timestamp;
}
