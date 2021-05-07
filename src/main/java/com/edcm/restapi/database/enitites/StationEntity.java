package com.edcm.restapi.database.enitites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;
import java.util.Arrays;

@NoArgsConstructor
@Getter
@Document(collection = "Stations")
public class StationEntity {
    @Id
    public String id;

    @Setter
    @NonNull
    public String stationName;

    @Setter
    @NonNull
    public String systemName;

    @Setter
    public String[] prohibited;

    @Setter
    public CommodityEntity[] commodities;

    @Setter
    public EconomyEntity[] economies;

    @Setter
    @NonNull
    public Instant timestamp;

    @Override
    public String toString() {
        return String.format(
            "Station [id='%s', stationName='%s', systemName='%s', prohibited='%s', commodities='%s', economies='%s', timestamp='%s']",
            id,
            stationName,
            systemName,
            Arrays.toString(prohibited),
            Arrays.toString(commodities),
            Arrays.toString(economies),
            timestamp
        );
    }
}
