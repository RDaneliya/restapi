package com.edcm.restapi.database.enitites;


import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Document(collection = "Wishlist")
public class WishlistCommodityEntity implements WishlistItemPrototype {

    @Id
    public String id;
    @Setter
    public int buyPrice;
    @Setter
    public int sellPrice;
    @Setter
    @NonNull
    public String name;

    public WishlistCommodityEntity(int buyPrice, int sellPrice, @NonNull String name) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.name = name;
    }

    public WishlistCommodityEntity() {
    }

    @Override
    public String toString() {
        return String.format(
            "Commodity [id='%s', buyPrice='%d', sellPrice='%d', name='%s']",
            id,
            buyPrice,
            sellPrice,
            name);
    }

    @Override
    public WishlistItemPrototype duplicate() {
        WishlistCommodityEntity duplicate = new WishlistCommodityEntity();
        duplicate.setBuyPrice(this.buyPrice);
        duplicate.setSellPrice(this.sellPrice);
        duplicate.setName(this.name);
        return duplicate;
    }
}
