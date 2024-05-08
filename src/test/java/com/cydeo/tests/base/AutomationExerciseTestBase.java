package com.cydeo.tests.base;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public abstract class AutomationExerciseTestBase {

    static protected Browser browser;
    static protected Playwright playwright;

    protected  Page page;

    @BeforeAll
    static void beforeAll() {
        playwright = Playwright.create();
      browser=  playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    }

    @AfterAll
    static void afterAll() {
        browser.close();
        playwright.close();
    }


    @BeforeEach
    void setUp() {
         page=browser.newPage(new Browser.NewPageOptions().setBaseURL("https://automationexercise.com"));


    }

    @AfterEach
    void tearDown() {

        page.close();
    }

}
