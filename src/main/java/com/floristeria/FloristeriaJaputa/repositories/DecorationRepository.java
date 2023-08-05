package com.floristeria.FloristeriaJaputa.repositories;
import com.floristeria.FloristeriaJaputa.model.Decoration;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DecorationRepository extends JpaRepository<Decoration, Long> {

}
