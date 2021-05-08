package com.edcm.restapi.core.shared.data;

import com.edcm.restapi.database.enitites.WishlistItemPrototype;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WishlistItemSharedData implements WishlistItemPrototype {
    public int buyPrice;

    public int sellPrice;

    public String name;

    @Override
    public WishlistItemPrototype duplicate() {
        return new WishlistItemSharedData(buyPrice, sellPrice, name);
    }
}
