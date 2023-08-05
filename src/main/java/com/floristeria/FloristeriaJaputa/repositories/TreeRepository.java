package com.floristeria.FloristeriaJaputa.repositories;

import com.floristeria.FloristeriaJaputa.model.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TreeRepository extends JpaRepository<Tree, Long> {

}
