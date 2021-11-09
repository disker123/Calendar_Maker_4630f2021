package com.example.calendarmaker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.calendarmaker.ui.theme.CalendarMakerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalendarMakerTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MyCoolForm()
                }
            }
        }
    }
}
data class Message(val author: String, val body: String)

@Composable
fun MyCoolForm() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        OutlinedTextField(
            value = "",
            label = { Text("Academic Calendar link") },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(8.dp))
        OutlinedTextField(
            value = "",
            label = { Text("Class Name") },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(8.dp))
        OutlinedTextField(
            value = "",
            label = { Text("Class type") },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.size(4.dp))
        OutlinedTextField(
            value = "",
            label = { Text("Class number") },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(4.dp))
        OutlinedTextField(
            value = "",
            label = { Text("Section number") },
            onValueChange = {},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.size(4.dp))
        Button(enabled = false, onClick = {}) {
            Text(text = "Save")
        }
    }
}
/*
@Composable
fun DropdownDemo() {
    var expanded by remember { mutableStateOf(false) }
    val items = listOf("COMP", "EECE", "MECH", "MATH", "BIO", "CHEM")
    var selectedIndex by remember { mutableStateOf(0) }
    Box(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.TopStart)) {
        Text(items[selectedIndex],modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { expanded = true })
            .background(
                Color.LightGray
            ))
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Color.White
                )
        ) {
            items.forEachIndexed { index, s ->
                DropdownMenuItem(onClick = {
                    selectedIndex = index
                    expanded = false
                }) {
                    val disabledText = if (s == disabledValue) {
                        " (Disabled)"
                    } else {
                        ""
                    }
                    Text(text = s + disabledText)
                }
            }
        }
    }
    return
}
*/

@Preview
@Composable
fun PreviewMessageCard() {
    MyCoolForm()
}
