package com.floristeria.FloristeriaJaputa.repositories;

import com.floristeria.FloristeriaJaputa.model.Flower;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlowerRepository extends JpaRepository<Flower, Long> {

}