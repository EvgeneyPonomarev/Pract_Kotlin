import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.pr_10.MainActivity

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    val  composeTestRule= createAndroidComposeRule<MainActivity>()
    @Test
    fun normFun() {
        composeTestRule.onNodeWithTag("vvoda").performTextInput("5")
        composeTestRule.onNodeWithTag("vvodb").performTextInput("8")
        composeTestRule.onNodeWithTag("button").performClick()
        composeTestRule.onNodeWithTag("result1").assertTextEquals("8 / -5 = 1.6")
    }
    @Test
    fun zero() {
        composeTestRule.onNodeWithTag("vvoda").performTextInput("0")
        composeTestRule.onNodeWithTag("vvodb").performTextInput("3")
        composeTestRule.onNodeWithTag("button").performClick()
        composeTestRule.onNodeWithTag("result1").assertTextEquals("Множество значений")
    }
    @Test
    fun loch() {
        composeTestRule.onNodeWithTag("vvoda").performTextInput("12")
        composeTestRule.onNodeWithTag("vvodb").performTextInput("3")
        composeTestRule.onNodeWithTag("button").performClick()
        composeTestRule.onNodeWithTag("result1").assertTextEquals("12")
    }

}