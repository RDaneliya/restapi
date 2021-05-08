package com.edcm.restapi.api.responses;

import com.edcm.restapi.api.items.StationResponseItem;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class StationResponse {
    public List<StationResponseItem> stations;
}
