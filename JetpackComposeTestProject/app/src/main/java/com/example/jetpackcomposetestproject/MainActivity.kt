package com.example.jetpackcomposetestproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.core.setContent
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Color
import androidx.ui.graphics.Shape
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxWidth
import androidx.ui.layout.padding
import androidx.ui.layout.preferredHeightIn
import androidx.ui.material.Button
import androidx.ui.material.Surface
import androidx.ui.res.imageResource
import androidx.ui.text.style.TextDecoration
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcomposetestproject.ui.JetpackComposeTestProjectTheme
import com.example.jetpackcomposetestproject.ui.typography

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            NewsStory()
            Counter()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//@Composable
//fun NewsStory() {
//    val image = imageResource(R.drawable.header)
//    Column(
//        modifier = Modifier.padding(15.dp)
//    ) {
//        val imageModifier = Modifier
//            .preferredHeightIn(maxHeight = 180.dp)
//            .fillMaxWidth()
//            .clip(shape = RoundedCornerShape(5.dp))
//        Image(image, modifier = imageModifier,
//            contentScale = ContentScale.Crop)
//
//        Text("Đại học Khoa học Tự nhiên", style = typography.h5, color = Color.Blue, textDecoration = TextDecoration.Underline)
//        Text("Khoa công nghệ thông tin", style = typography.h6, color = Color.Red,  textDecoration = TextDecoration.LineThrough)
//        Text("Môn các công nghệ mới", style = typography.body2)
//    }
//}


@Composable
fun Counter() {
    val amount = state { 0 }

    Column( modifier = Modifier.padding(15.dp)) {
        Text(text = "Counter demo")
        Button( onClick = { amount.value++ }, modifier = Modifier.padding(bottom = 5.dp)) {
            Text("Add")
        }
        Button( onClick = { amount.value-- }){
            Text("Subtract")
        }
        Text(text = "Clicks: ${amount.value}")
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
//        NewsStory()
    Counter()
}