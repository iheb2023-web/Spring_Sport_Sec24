package com.iheb.sport.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class sport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSport;
    private String nomSport;
    private String description;
    @Temporal(TemporalType.DATE)
    private Date dateFondation;
    @ManyToOne
    private Genre genre;
    /*@OneToOne
    private Image image;*/
    @OneToMany (mappedBy = "sport")
    private List<Image> images;

    private String imagePath;


    public sport( String nomSport, String description, Date dateFondation) {
        super();
        this.nomSport = nomSport;
        this.description = description;
        this.dateFondation = dateFondation;

    }

    public sport() {
        super();
    }


    public Long getIdSport() {
        return idSport;
    }
    public void setIdSport(Long idSport) {
        this.idSport = idSport;
    }

    public String getNomSport() {
        return nomSport;
    }
    public void setNomSport(String nomSport) {
        this.nomSport = nomSport;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateFondation() {
        return dateFondation;
    }
    public void setDateFondation(Date dateFondation) {
        this.dateFondation = dateFondation;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
	public String toString() {
		return "sport [idSport=" + idSport + ", nomSport=" + nomSport + ", description=" + description
				+ ", dateFondation=" + dateFondation +  "]";
	}

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
