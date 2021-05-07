package com.edcm.restapi.database.enitites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@NoArgsConstructor
@Getter
public class CommodityEntity {
    @Id
    public String id;

    @Setter
    public int buyPrice;

    @Setter
    public int sellPrice;

    @Setter
    public int stock;

    @Setter
    public int demand;

    @Setter
    @NonNull
    public String category;

    @Setter
    @NonNull
    public String name;

    @Override
    public String toString() {
        return String.format(
            "Commodity [id='%s', buyPrice='%d', sellPrice='%d', stock='%d' demand ='%d', category='%s', name='%s']",
            id,
            buyPrice,
            sellPrice,
            stock,
            demand,
            category,
            name);
    }
}
