package com.example.thirtydaysapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thirtydaysapp.CardsRepository.cards
import com.example.thirtydaysapp.ui.theme.ThirtyDaysAppTheme

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   ThirtyDaysAppTheme {
    // A surface container using the 'background' color from the theme
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
     ThirtDaysApp();
    }
   }
  }
 }
}

@Composable
fun ThirtDaysApp() {
 Scaffold(
  topBar = {
   Row(
    modifier = Modifier
     .fillMaxWidth()
     .background(color = MaterialTheme.colors.primaryVariant),
    verticalAlignment = Alignment.CenterVertically,
    horizontalArrangement = Arrangement.Center
   ) {
    Text(
     text = stringResource(id = R.string.app_name),
     style = TextStyle(fontSize = 30.sp)
    )
   }
  }
 ) {
  ListofCards();

 }
}

@Composable
fun CardActivity(card: CardDay, modifier: Modifier = Modifier) {
 Card(
  modifier = Modifier
   .fillMaxSize()
   .padding(10.dp),
  elevation = 10.dp
 ) {
  var showDesc by remember { mutableStateOf(false) };
  Column(
   modifier = Modifier
    .padding(15.dp)
    .animateContentSize(
     animationSpec = spring(
      dampingRatio = Spring.DampingRatioMediumBouncy,
      stiffness = Spring.StiffnessLow
     )
    )
  ) {
   Text(text = stringResource(id = card.dayId))
   Text(text = stringResource(id = card.titleId))
   Image(
    painter = painterResource(id = card.imageId),
    contentDescription = null,
    contentScale = ContentScale.Crop,
    modifier = Modifier
     .fillMaxWidth()
     .clip(RoundedCornerShape(10.dp))
     .clickable { showDesc = !showDesc }
   )
   if (showDesc) {
    Text(text = stringResource(id = card.descId))
   }
  }
 }
}

@Composable
fun ListofCards() {
 LazyColumn {
  items(cards) { card ->
   CardActivity(card)
  }
 }
}

@Preview(showSystemUi = true)
@Composable
fun DefaultPreview() {
 ThirtyDaysAppTheme {
  ThirtDaysApp();
 }
}