package com.iheb.sport.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomSport", types = { sport.class })
public interface SportProjection {
    public String getNomSport();
}
