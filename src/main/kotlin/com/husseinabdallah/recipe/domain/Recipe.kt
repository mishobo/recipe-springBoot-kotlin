package com.husseinabdallah.recipe.domain

import javax.persistence.*

@Entity
data class Recipe (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,
    var description:String?,
    var prepTime: String?,
    var cockTime: String?,
    var servings: String?,
    var url: String?,
    var directions: String?,

    @OneToMany(cascade = [CascadeType.ALL], mappedBy = "recipe")
    var ingredient: Set<Ingredient>?,

    @OneToOne(cascade = [CascadeType.ALL])
    var notes:Note?, //Foreign Key

    @ManyToMany
    @JoinTable(
        name="recipe_category",
        joinColumns = [JoinColumn(name = "recipe_id")],
        inverseJoinColumns = [JoinColumn(name = "category_id")]
    )
    val category: Set<Category>?,

    @Enumerated(value = EnumType.STRING)
    val difficulty: Difficulty,
    )