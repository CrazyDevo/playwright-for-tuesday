package com.cydeo.tests.week01;

import com.cydeo.tests.base.AutomationExerciseTestBase;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HW001_SignUpPage extends AutomationExerciseTestBase {


    @Test
    void verifySignUpPageTestEnterAccountInformation() {
        page.navigate("/login");
        page.getByPlaceholder("Name").fill("Test User");
        page.getByPlaceholder("Email Address").nth(1).fill("brettacrossotei-6800@yopmail.fr");
        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Signup")).click();
        boolean enterAccountInformation = page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("ENTER ACCOUNT INFORMATION")).isVisible();
        Assertions.assertTrue(enterAccountInformation);

    }

    @Test
    void verifySignUpPageTestAddressInformation() {
        page.navigate("/login");
        page.getByPlaceholder("Name").fill("Test User");
        page.getByPlaceholder("Email Address").nth(1).fill("brettacrossotei-6800@yopmail.fr");
        page.getByRole(AriaRole.BUTTON,new Page.GetByRoleOptions().setName("Signup")).click();
        boolean enterAccountInformation = page.getByRole(AriaRole.HEADING, new Page.GetByRoleOptions().setName("ADDRESS INFORMATION")).isVisible();
        Assertions.assertTrue(enterAccountInformation);

    }
}
