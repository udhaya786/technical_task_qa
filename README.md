# News App

A clean and modern Android application for viewing news articles, built with Jetpack Compose. This app features a persistent login state and a clean UI to display a list of news articles.

# Features

User Authentication:  Secure login with username and password.
Persistent Login:  The user's login state is saved, so they don't have to log in every time the app is restarted.
News Feed: A dynamic feed of news articles with images.
Modern UI: Built entirely with Jetpack Compose for a declarative and responsive user interface.
*Dependency Injection:Uses Hilt for a scalable and maintainable architecture.

# Tech Stack

Language: Kotlin
UI Toolkit:  Jetpack Compose
Architecture: MVVM (Model-View-View Model)
Dependency Injection:  Hilt
Data Persistence: Shared Preferences (for login state)


## Automated Testing

Automated UI testing using Jetpack Compose Test API
Test coverage for core UI components and interactions
Semantic tagging of Compose components for easier testing New test files and configurations added under src/androidTest/


### Test Tool Choice: Jetpack Compose Test

This project uses Jetpack Compose Test for all UI test. This decision was made because Compose Test is the official, purpose-built framework for testing Jetpack Compose applications.

The key reasons for choosing Compose Test over other tools like Espresso are:

•	Native to Compose: It directly understands the declarative nature of your UI, working with a "semantic tree" rather than the traditional Android View hierarchy. This makes tests more robust to layout changes.
•	Automatic Synchronization: Compose Test automatically waits for UI changes and state updates, which dramatically reduces test flakiness and the need for manual waits.
•	Faster Execution: UI tests can be run on the JVM without an emulator, providing rapid feedback during the development cycle.
•	Robustness: It uses `testTag` semantics for locating elements, which is a more reliable and intentional method for testing than relying on view resource IDs.


## Manual Test Cases

These manual test cases can be used to verify the app's behaviour by a human tester.

| Test Case | Steps | Expected Result |
| Verify Valid Login| 1. Open the app. <br> 2. Enter `correctUser` and `correctPass`. <br> 3. Click the "Login" button. | The app navigates to the News screen. |
| Verify Invalid Login | 1. Open the app. <br> 2. Enter `incorrectUser` and `incorrectPass`. <br> 3. Click the "Login" button. | An error message is displayed below the login fields. The app stays on the Login screen. |
| Verify Persistent Login| 1. Perform a valid login. <br> 2. Close the app completely (swipe it away from recent apps). <br> 3. Reopen the app. | The app bypasses the Login screen and opens directly to the News screen. |

### Test File Structure and Execution

All instrumentation tests are located in the `app/src/androidTest/java/com/test/news/` directory.

### To run the tests: 

1.  Open Android Studio.
2.  Navigate to the specific test file you want to run (e.g., `LoginScreenTest.kt`).
3.  Click the green play button next to the test class or an individual test function.
