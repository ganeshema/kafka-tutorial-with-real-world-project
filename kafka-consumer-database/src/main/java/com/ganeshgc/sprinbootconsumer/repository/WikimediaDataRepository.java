package com.ganeshgc.sprinbootconsumer.repository;

import com.ganeshgc.sprinbootconsumer.Entity.WikimediaEntityData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface WikimediaDataRepository extends JpaRepository<WikimediaEntityData, Long> {
}
