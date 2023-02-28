package edu.uksw.fti.pam.pam_activity_intent.ui.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.PAM_Activity_IntentTheme
import edu.uksw.fti.pam.pam_activity_intent.ui.theme.Teal200
import edu.uksw.fti.pam.pam_activity_intent.R


@Composable
fun Home () {
    Box(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()
    ) {
        Column {
            NavbarAtas()
            Greeting(name = "Anatasya Lingkanwene")
            Fitur()
            Promo()
            Iklan()
            Bawah()
        }
    }
}

@Composable
fun Promo () {
    Text(
        text = "Dapatkan Promo Menarik!",
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.v1),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.v2),
            )
        }
    }
}

@Composable
fun Iklan () {
    Text(
        text = "",
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 20.dp)
    )
    LazyRow(
        Modifier.height(160.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.v3),
            )
        }
        item {
            PromotionItem(
                imagePainter = painterResource(id = R.drawable.v4),
            )
        }
    }
}


@Composable
fun PromotionItem(
    backgroundColor: Color = Color.Transparent,
    imagePainter: Painter
) {
    Card(
        Modifier.width(300.dp),
        shape = RoundedCornerShape(8.dp),
        backgroundColor = backgroundColor,
        elevation = 0.dp
    ) {
        Row {
            Image(
                painter = imagePainter, contentDescription = "",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                alignment = Alignment.CenterEnd,
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
fun Fitur () {
    Column(Modifier.padding(horizontal = 20.dp)) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.kereta),
                contentDescription = "Kereta",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.hotel),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.pesawat),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.taxi),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.finansial),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.bil),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.gift),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
            Image(
                painter = painterResource(id = R.drawable.disc),
                contentDescription = "Fitur",
                modifier = Modifier
                    .size(60.dp)
                    .clickable { "" }
            )
        }
    }
}


@Composable
fun NavbarAtas() {
    Row(
        Modifier
            .padding(20.dp)
            .height(48.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Hi Anatasya!", fontSize = 12.sp) },
            singleLine = true,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = "Search"
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.White,
                focusedIndicatorColor = Color.Blue,
                unfocusedIndicatorColor = Color.Gray
            ),
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
        )
        Spacer(modifier = Modifier.width(5.dp))
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "",
                tint = Color.Blue
            )
        }
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = "",
                tint = Color.Blue
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Outlined.Notifications,
                contentDescription = "",
                tint = Color.Blue
            )
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = "",
                    tint = Color.Blue
                )
            }
        }
    }
}
@Composable
fun Greeting(name: String) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(17.dp)
    ) {
        Column() {
            Text(
                text = " Hi, $name",
                fontWeight = FontWeight.Bold
            )

        }
        Button(
            onClick = {
                // val navigate = Intent(lContext, MainActivity.this, HomeActivity::class.java)
                //getUsernameFromSignupForm.launch("")
            },
            modifier = Modifier.padding(start = 15.dp),
            shape = RoundedCornerShape(25.dp)
        ) {
            Text(text = "Profil Saya")

        }
    }
}

@Composable
fun Bawah () {
    var bottomState by remember {
        mutableStateOf("")
    }
    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                Alignment.Center) {
                Text(text = bottomState,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                )
            }
        },
        bottomBar = {
            BottomNavigation(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)),
                backgroundColor = Color.White,
                contentColor = Color.Gray
            ) {
                BottomNavigationItem(
                    selected = bottomState == "Home" ,
                    onClick = { bottomState = "Home"},
                    label = { Text(text = "Home")},
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) }
                )

                BottomNavigationItem(
                    selected = bottomState == "History" ,
                    onClick = { bottomState = "History"},
                    label = { Text(text = "History")},
                    icon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) }
                )
                BottomNavigationItem(
                    selected = bottomState == "Pesanan" ,
                    onClick = { bottomState = "Pesanan"},
                    label = { Text(text = "Pesanan")},
                    icon = { Icon(imageVector = Icons.Default.Create, contentDescription = null) }
                )
                BottomNavigationItem(
                    selected = bottomState == "Favorit" ,
                    onClick = { bottomState = "Favorit"},
                    label = { Text(text = "Favorit")},
                    icon = { Icon(imageVector = Icons.Default.Star, contentDescription = null) }
                )

            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAM_Activity_IntentTheme {
        Home()
    }
}