import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navkotlin.ui.theme.NavKotlinTheme

@Composable
fun SecondScreen(name:String, age:Int, navigateToFirstScreen:()->Unit) {

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Second Screen")
        Text(text = "Hi my name is $name and my age is $age")
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navigateToFirstScreen()
        }) {
            Text(text = "Go to first screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    NavKotlinTheme {
    }
}