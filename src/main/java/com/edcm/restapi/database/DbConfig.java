package com.edcm.restapi.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@Component
public class DbConfig {
    private final MongoTemplate mongoTemplate;

    @Autowired
    public DbConfig(MongoTemplate mongoTemplate){
        this.mongoTemplate = mongoTemplate;
    }
}
