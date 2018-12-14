package com.michalkrause.spring5recipeapp.repositories;

import com.michalkrause.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
