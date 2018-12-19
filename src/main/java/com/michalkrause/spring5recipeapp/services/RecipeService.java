package com.michalkrause.spring5recipeapp.services;

import com.michalkrause.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
