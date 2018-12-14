package com.michalkrause.spring5recipeapp.repositories;

import com.michalkrause.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
}
