import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.navkotlin.ui.theme.NavKotlinTheme

@Composable
fun FirstScreen(navigateToSecondScreen:(String, Int)->Unit) {
    val name= remember {
        mutableStateOf("")
    }
    val age= remember {
        mutableIntStateOf(0)
    }
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "First Screen")
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = name.value, onValueChange ={
            name.value=it
        } )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(value = age.intValue.toString(), onValueChange ={
            age.intValue=it.toInt()
        } )
        Button(onClick = {
            navigateToSecondScreen(name.value, age.value)
        }) {
            Text(text = "Go to second screen")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    NavKotlinTheme {
    }
}