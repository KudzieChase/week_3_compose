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
package com.example.androiddevchallenge.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.model.Item
import com.example.androiddevchallenge.model.bodyItems
import com.example.androiddevchallenge.model.favoriteCollection
import com.example.androiddevchallenge.model.favoriteCollection2
import com.example.androiddevchallenge.model.mindItems
import com.example.androiddevchallenge.ui.theme.MyTheme
import com.example.androiddevchallenge.ui.theme.gray800
import com.example.androiddevchallenge.ui.theme.taupe100
import com.example.androiddevchallenge.ui.theme.taupe800
import com.example.androiddevchallenge.ui.theme.white800
import com.example.androiddevchallenge.utils.BottomNavIcon
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun HomeScreen(navController: NavController) {
    val isLightMode = MaterialTheme.colors.isLight
    Scaffold(
        bottomBar = {
            BottomNavigation(
                backgroundColor = MaterialTheme.colors.background,
                elevation = 8.dp
            ) {
                BottomNavigationItem(
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            BottomNavIcon.Home.icon,
                            contentDescription = "home",
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    label = {
                        Text(text = "HOME")
                    },
                    selectedContentColor = if (isLightMode) taupe800 else taupe100
                )
                BottomNavigationItem(
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = {
                        Icon(
                            BottomNavIcon.Profile.icon,
                            contentDescription = "home",
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    label = {
                        Text(text = "PROFILE")
                    },
                    selectedContentColor = if (isLightMode) taupe800 else taupe100
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                backgroundColor = MaterialTheme.colors.primary,
                onClick = { /*TODO*/ }
            ) {
                Icon(
                    BottomNavIcon.Play.icon,
                    contentDescription = "home",
                    modifier = Modifier.size(24.dp)
                )
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        isFloatingActionButtonDocked = true
    ) {

        Surface(color = MaterialTheme.colors.background) {

            Column(modifier = Modifier.fillMaxSize()) {

                TextField(
                    "",
                    onValueChange = { },
                    modifier = Modifier
                        .padding(horizontal = 16.dp)
                        .padding(top = 56.dp)
                        .fillMaxWidth(),
                    leadingIcon = {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = "Search",
                            modifier = Modifier.size(18.dp)
                        )
                    },
                    label = {
                        Text(
                            text = "Search",
                            style = MaterialTheme.typography.body1,
                            color = if (isLightMode) gray800 else white800
                        )
                    },
                    colors = TextFieldDefaults.textFieldColors(textColor = MaterialTheme.colors.onSurface)
                )

                LazyColumn(modifier = Modifier.padding(horizontal = 16.dp)) {
                    item {
                        Text(
                            text = "FAVORITE COLLECTIONS",
                            style = MaterialTheme.typography.h2,
                            modifier = Modifier
                                .paddingFromBaseline(top = 40.dp, bottom = 8.dp),
                            color = if (isLightMode) taupe800 else taupe100
                        )
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            items(favoriteCollection) { item ->
                                ItemCardRow(item)
                            }
                        }
                        Spacer(modifier = Modifier.height(8.dp))
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            items(favoriteCollection2) { item ->
                                ItemCardRow(item)
                            }
                        }
                        Text(
                            text = "ALIGN YOUR BODY",
                            style = MaterialTheme.typography.h2,
                            modifier = Modifier
                                .paddingFromBaseline(top = 40.dp, bottom = 8.dp),
                            color = if (isLightMode) taupe800 else taupe100

                        )
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            items(bodyItems) { item ->
                                ItemCircleRow(item = item)
                            }
                        }
                        Text(
                            text = "ALIGN YOUR MIND",
                            style = MaterialTheme.typography.h2,
                            modifier = Modifier
                                .paddingFromBaseline(top = 40.dp, bottom = 8.dp),
                            color = if (isLightMode) taupe800 else taupe100

                        )
                        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                            items(mindItems) { item ->
                                ItemCircleRow(item = item)
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun ItemCircleRow(item: Item) {
    val isLightMode = MaterialTheme.colors.isLight
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        GlideImage(
            data = item.image,
            contentDescription = "",
            modifier = Modifier
                .clip(CircleShape)
                .height(88.dp)
                .aspectRatio(1f),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier.height(24.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(item.title)
        }
    }
}

@Composable
fun ItemCardRow(item: Item) {
    val isLightMode = MaterialTheme.colors.isLight
    Surface(
        modifier = Modifier
            .size(192.dp, 56.dp),
        shape = MaterialTheme.shapes.small
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            GlideImage(
                data = item.image,
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 16.dp)
                    .size(56.dp),
                contentScale = ContentScale.Crop
            )

            Text(
                item.title,
                style = MaterialTheme.typography.h3,
                color = if (isLightMode) taupe800 else taupe100
            )
        }
    }
}

@Preview("Light Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenPreview() {
    MyTheme {
        HomeScreen(navController = rememberNavController())
    }
}

@Preview("Dark Theme", widthDp = 360, heightDp = 640)
@Composable
fun HomeScreenDarkPreview() {
    MyTheme(darkTheme = true) {
        HomeScreen(navController = rememberNavController())
    }
}
