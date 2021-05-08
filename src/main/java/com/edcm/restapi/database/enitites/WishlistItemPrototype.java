package com.edcm.restapi.database.enitites;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Wishlist")
public interface WishlistItemPrototype {
    String getName();
    WishlistItemPrototype duplicate();
}
