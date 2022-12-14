package com.husseinabdallah.recipe.domain

import java.math.BigDecimal
import javax.persistence.*

@Entity
data class Ingredient(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val description:String?,
    val amount: BigDecimal?,

    @ManyToOne
    val recipe: Recipe,

    @OneToOne(fetch = FetchType.EAGER)//Unidirectional to UnitMeasure //loaded every time
    var unitOfMeasure: UnitMeasure?

) {
}