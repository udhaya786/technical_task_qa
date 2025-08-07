package com.test.news.page

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.ComposeTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import dagger.hilt.android.testing.HiltAndroidTest
import javax.inject.Inject

@HiltAndroidTest

class LoginPageObject @Inject constructor(composeTestRule: ComposeTestRule) : BasePageObject(composeTestRule) {

    // Locators for the login screen
    private val usernameField = composeTestRule.onNodeWithTag("usernameField")
    private val passwordField = composeTestRule.onNodeWithTag("passwordField")
    private val loginButton = composeTestRule.onNodeWithTag("loginButton")
    private val errorMessage = composeTestRule.onNodeWithTag("errorMessage")

    // Actions related to the Login Screen
    fun enterUsername(username: String) {
        composeTestRule.onNodeWithTag("usernameField")
            .performTextInput(username)
    }

    fun enterPassword(password: String) {
        composeTestRule.onNodeWithTag("passwordField")
            .performTextInput(password)
    }

    fun clickLoginButton() {
        composeTestRule.onNodeWithTag("loginButton")
            .performClick()
    }

    // Verify if the login button is displayed
    fun verifyLoginButtonVisible() {
        composeTestRule.onNodeWithTag("loginButton")
            .assertIsDisplayed()
    }

    // Verify if the password field is displayed
    fun verifyPasswordFieldVisible() {
        composeTestRule.onNodeWithTag("passwordField")
            .assertIsDisplayed()
    }
    // Verify Login Screen displayed
    fun verifyLoginScreenIsDisplayed() {
        usernameField.assertIsDisplayed()
        passwordField.assertIsDisplayed()
        loginButton.assertIsDisplayed()
    }
    // Verify if an error message is shown on the login screen
    fun verifyErrorMessageVisible(message: String) {
        composeTestRule.onNodeWithText(message)
            .assertIsDisplayed()
    }

}
