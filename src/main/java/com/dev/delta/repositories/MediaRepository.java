package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.delta.entities.Media;

public interface MediaRepository extends JpaRepository<Media, Long> {

}
