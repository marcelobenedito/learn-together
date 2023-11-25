package com.github.marcelobenedito.learntogether

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.github.marcelobenedito.learntogether.ui.theme.LearnTogetherTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LearnTogetherTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Article(
                        image = R.drawable.bg_compose_background,
                        title = stringResource(R.string.article_title),
                        text1 = stringResource(R.string.article_text_1),
                        text2 = stringResource(R.string.article_text_2)
                    )
                }
            }
        }
    }
}

@Composable
fun Article(image: Int, title: String, text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // 1. Set the image to fill the entire screen's width.
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
        )
        // 2. Set the first Text composable to a 24sp font size and 16dp padding (start, end, bottom, and top).
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
        // 3. Set the second Text composable to a default font size, 16dp padding(start and end), and Justify text align.
        Text(
            text = text1,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(horizontal = 16.dp)
        )
        // 4. Set the third Text composable to a default font size, 16dp padding (start, end, bottom, and top), and Justify text align.
        Text(
            text = text2,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp)
        )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    LearnTogetherTheme {
        Article(
            image = R.drawable.bg_compose_background,
            title = stringResource(R.string.article_title),
            text1 = stringResource(R.string.article_text_1),
            text2 = stringResource(R.string.article_text_2)
        )
    }
}