package com.example.androiddevchallenge.model

import com.example.androiddevchallenge.utils.Images

data class Item(
    val image: String = "",
    val title: String,
)

val mindItems = listOf(
    Item(
        image = Images.Meditate.link,
        title = "Meditate"
    ),
    Item(
        image = Images.With_Kids.link,
        title = "With kids"
    ),
    Item(
        image = Images.Aromatherapy.link,
        title = "Aromatherapy"
    ),
    Item(
        image = Images.On_The_Go.link,
        title = "On the go"
    ),
    Item(
        image = Images.With_Pets.link,
        title = "With pets"
    ),
    Item(
        image = Images.High_Stress.link,
        title = "High stress"
    )
)
