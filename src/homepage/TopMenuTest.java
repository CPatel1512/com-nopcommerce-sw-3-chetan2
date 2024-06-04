package homepage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class TopMenuTest extends Utility {
    @Before
    public void setUp() {

        setBaseUrl();
    }

    /**
     * create class "TopMenuTest"
     * 1.1 create method with name "selectMenu" it has one parameter name "menu" of type
     * string
     * 1.2 This method should click on the menu whatever name is passed as parameter.
     * 1.3. create the @Test method name verifyPageNavigation.use selectMenu method to
     * select the Menu and click on it and verify the page navigation.
     * @param menu
     */
    public void selectMenu(String menu) {
        driver.findElement(By.linkText(menu)).click();
    }
    @Test
    public void verifyPageNavigationUseSlectMenu(){
        selectMenu("Computers");
        //verify the page navigation
        WebElement pageHead = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String headerText = pageHead.getText();
        Assert.assertEquals("The page is not as expected","Computers",headerText);


    }
    @After
    public void TearDown(){
        driver.close();
    }



}

