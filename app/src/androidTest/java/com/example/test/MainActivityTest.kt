package com.example.test

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4


@RunWith(JUnit4::class)
class MainActivityTest {

    @get:Rule
    val rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleMathAddTest(){
        onView(withId(R.id.et_num1)).perform(typeText(""))
        onView(withId(R.id.et_num2)).perform(typeText(""))
        onView(withId(R.id.btn_plus)).perform(click())
        onView(withId(R.id.btn_minus)).perform(click())
        onView(withId(R.id.btn_multiply)).perform(click())
        onView(withId(R.id.btn_division)).perform(click())
        onView(withId(R.id.tv_result)).check(matches(withText("")))
    }
}