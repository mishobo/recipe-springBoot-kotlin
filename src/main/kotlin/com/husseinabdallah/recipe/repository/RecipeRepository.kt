package com.husseinabdallah.recipe.repository

import com.husseinabdallah.recipe.domain.Recipe
import org.springframework.data.repository.CrudRepository

interface RecipeRepository : CrudRepository<Recipe, Long> {
}