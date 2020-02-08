package com.example.jhipsterswagger.repository;

import com.example.jhipsterswagger.model.Interest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the Interest entity.
 */
@SuppressWarnings("unused")
@Repository
public interface InterestRepository extends JpaRepository<Interest, Long> {

}
