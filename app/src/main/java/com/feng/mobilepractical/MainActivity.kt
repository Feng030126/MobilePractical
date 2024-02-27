package com.feng.mobilepractical

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.isVisible
import com.feng.mobilepractical.ui.theme.MobilePracticalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageViewQR: ImageView = findViewById(R.id.imageViewQR)
        val buttonShowHide: Button = findViewById(R.id.buttonShowHide)

        buttonShowHide.setOnClickListener {
            if (imageViewQR.isVisible)
            {
                buttonShowHide.text = getString(R.string.show)
                imageViewQR.visibility = View.INVISIBLE
            }
            else
            {
                buttonShowHide.text = getString(R.string.hide)
                imageViewQR.visibility = View.VISIBLE
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
            text = "Hello $name!",
            modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MobilePracticalTheme {
        Greeting("Android")
    }
}