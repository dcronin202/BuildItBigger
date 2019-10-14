package com.udacity.gradle.builditbigger;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;


// STEP 4: Add Functional Tests
@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() throws Exception {

        // Delay test so network call can be made
        Thread.sleep(1000);

        // Find the view
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.joke_button),
                isDisplayed()));

        // Perform action on the view
        appCompatButton.perform(click());

        // Check to make sure a joke is displayed
        onView(withId(R.id.joke_textview)).check(matches(isDisplayed()));

    }

}
