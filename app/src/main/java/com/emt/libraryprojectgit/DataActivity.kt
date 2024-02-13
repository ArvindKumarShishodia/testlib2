package com.emt.libraryprojectgit

import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import com.emt.libraryprojectgit.ui.theme.LibraryProjectGitTheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

class DataActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LibraryProjectGitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val mContext = LocalContext.current
                    // mContext.getString(R.string.ok)
                    val dps=mContext.resources.getDimension(com.intuit.sdp.R.dimen._200sdp)
                    //val dps=mContext.resources.getDimension(R.dimen._200sdp)
                    /*val rat=Retrofit.Builder().baseUrl("https://quotable.io/")
                        // we need to add converter factory to
                        // convert JSON object to Java object
                        .build()*/
                    // Greeting("Android "+dps)
                     Greeting1("Android library sussces "+dps)
                   // Greeting1("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting1(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview1() {
    LibraryProjectGitTheme {
        Greeting("Android")
    }
}