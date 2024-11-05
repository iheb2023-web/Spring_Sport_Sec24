package com.iheb.sport.repos;

import com.iheb.sport.entities.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository  extends JpaRepository<Image, Long> {
}
