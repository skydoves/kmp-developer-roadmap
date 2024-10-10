package io.getstream.kmp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.skydoves.landscapist.ImageOptions
import com.skydoves.landscapist.coil3.CoilImage

@Composable
fun Main() {
    MyApplicationTheme {

        Column(
            modifier = Modifier
                .fillMaxSize().background(MaterialTheme.colorScheme.onBackground)
        ) {

            CoilImage(
                modifier = Modifier.fillMaxWidth(),
                imageOptions = ImageOptions(contentScale = ContentScale.Fit),
                imageModel = { "https://plus.unsplash.com/premium_photo-1661963170818-43e58ed3a9e7?fm=jpg&q=60&w=3000&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MXx8b3R0ZXJ8ZW58MHx8MHx8fDA%3D" },
            )

            Text(
                modifier = Modifier.padding(12.dp),
                text = "Otter",
                color = MaterialTheme.colorScheme.onPrimary,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                modifier = Modifier.padding(horizontal = 12.dp),
                text = "Otters are carnivorous mammals in the subfamily Lutrinae. The 13 extant otter species are all semiaquatic, aquatic, or marine. Lutrinae is a branch of the Mustelidae family, which includes weasels, badgers, mink, and wolverines, among other animals.",
                color = MaterialTheme.colorScheme.onSecondary,
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}