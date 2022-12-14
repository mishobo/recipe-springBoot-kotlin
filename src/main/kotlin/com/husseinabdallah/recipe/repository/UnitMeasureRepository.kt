package com.husseinabdallah.recipe.repository

import com.husseinabdallah.recipe.domain.UnitMeasure
import org.springframework.data.repository.CrudRepository
import java.util.*

interface UnitMeasureRepository : CrudRepository<UnitMeasure, Long> {
    fun findByUnitOfMeasure(unit: String): Optional<UnitMeasure>
}