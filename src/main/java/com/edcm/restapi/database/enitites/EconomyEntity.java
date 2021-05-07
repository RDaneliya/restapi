package com.edcm.restapi.database.enitites;

import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.annotation.Id;

public class EconomyEntity {
    @Id
    public String id;

    @Setter
    public String name;

    @Setter
    public Double proportion;

    @Override
    public String toString() {
        return String.format("Economy [id='%s', name='%s', proportion='%f']", id, name, proportion);
    }
}
