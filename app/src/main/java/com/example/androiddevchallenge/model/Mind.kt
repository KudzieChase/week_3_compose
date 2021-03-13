/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
