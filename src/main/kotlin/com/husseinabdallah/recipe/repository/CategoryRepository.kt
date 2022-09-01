package com.husseinabdallah.recipe.repository

import com.husseinabdallah.recipe.domain.Category
import org.springframework.data.repository.CrudRepository
import java.util.*

interface CategoryRepository : CrudRepository<Category, Long> {
    fun findByName(name: String): Optional<Category>
}