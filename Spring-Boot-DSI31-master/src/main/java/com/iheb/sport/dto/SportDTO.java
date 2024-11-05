package com.iheb.sport.dto;

import com.iheb.sport.entities.Genre;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SportDTO {
    private Long idSport;
    private String nomSport;
    private String Description;
    @Temporal(TemporalType.DATE)
    private Date dateFondation;
    private Genre genre;
    private String nomGen;
}
