package com.cydeo.tests.week01;

import com.cydeo.tests.base.AutomationExerciseTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class HW002_CartPage extends AutomationExerciseTestBase {

    @Test
    void verifyEmptyCart() {
        page.navigate("/view_cart");
        String actualLabel = page.locator("//p/b").textContent();
        Assertions.assertEquals("Cart is empty!",actualLabel);

    }

    
}
