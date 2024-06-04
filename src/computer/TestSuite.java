package computer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.Utility;

public class TestSuite extends Utility {
    @Before
    public void setUp(){
        setBaseUrl();
    }
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
//        1.1 Click on Computer Menu.
//        1.2 Click on Desktop
        WebElement computer = driver.findElement(By.linkText("Computers"));
        WebElement desktop = driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[3]/a[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(computer).moveToElement(desktop).click().build().perform();

//        1.3 Select Sort By position "Name: Z to A"
        WebElement sortby = driver.findElement(By.name("products-orderby"));
        WebElement  ztoa = driver.findElement(By.xpath("//select[@id='products-orderby']//option[contains(text(),'Name: Z to A')]"));
        Actions actions1 = new Actions(driver);
       // actions1.moveToElement(sortby).click().moveToElement(ztoa).click().build().perform();

//        1.4 Verify the Product will arrange in Descending order
        WebElement orderby = driver.findElement(By.name("products-pagesize"));
        WebElement decending = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
        Actions actions3 = new Actions(driver);
        actions3.moveToElement(orderby).click().moveToElement(decending).click().build().perform();
        Assert.assertEquals("The page is not as expected","orderby",decending);
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){


        //2.1 Click on Computer Menu.
        driver.findElement(By.linkText("Computers")).click();

        //2.2 Click on Desktop
        //driver.findElement(By.xpath("////li[@class='inactive']//a[normalize-space()='Desktops']")).click();
        driver.findElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]")).click();
        //2.3 Select Sort By position "Name: A to Z"
        driver.findElement(By.xpath("//select[@id='products-orderby'])]"));
        driver.findElement(By.xpath("//option[contains(text(),'Name: A to Z'")).click();
        //2.4 Click on "Add To Cart"
        driver.findElement(By.xpath("//body/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        //2.5 Verify the Text "Build your own computer"
        WebElement pageHead = driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]"));
        String headerText = pageHead.getText();
        Assert.assertEquals("The page is not as expected","Build your own computer",headerText);
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        pageHead.click();
        mouseHoverToElement(By.cssSelector("#product_attribute_1"));
        selectByValueFromDropDown(By.xpath("//option[contains(text(),'2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00]"),"1");
        //2.7.Select "8GB [+$60.00]" using Select class.
        mouseHoverToElement(By.cssSelector("#product_attribute_2"));
        selectByValueFromDropDown(By.xpath("//option[contains(text(),'8GB [+$60.00]"),"5");
        //2.8 Select HDD radio "400 GB [+$100.00]"
        mouseHoverToElement(By.cssSelector("#product_attribute_3_7"));
        selectByValueFromDropDown(By.xpath("//label[contains(text(),'400 GB [+$100.00]"),"7");
        //2.9 Select OS radio "Vista Premium [+$60.00]"
        mouseHoverToElement(By.cssSelector("#product_attribute_4_9"));
        selectByValueFromDropDown(By.xpath("//label[contains(text(),'Vista Premium [+$60.00]"),"9");
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
        mouseHoverToElement(By.cssSelector("#product_attribute_5_10"));
        selectByValueFromDropDown(By.xpath("//label[contains(text(),'Microsoft Office [+$50.00]"),"10");
        //2.11 Verify the price "$1,475.00"
        WebElement price = driver.findElement(By.xpath("#price-value-1"));
        WebElement actualPrice = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
        Actions actions4 = new Actions(driver);
        actions4.moveToElement(price).click().moveToElement(actualPrice).click().build().perform();
        //2.12 Click on "ADD TO CART" Button.
        driver.findElement(By.cssSelector("#add-to-cart-button-1")).click();
        //2.13 Verify the Message "The product has been added to your shopping cart" on Top
        WebElement extectedtext = driver.findElement(By.xpath("//a[contains(text(),'shopping cart')]"));
        WebElement   ectualText = driver.findElement(By.xpath(" expactualT"));
        Assert.assertEquals("messege not displayed",extectedtext,ectualText);
        driver.findElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]")).click();
            //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]")).click();
        //2.15 Verify the message "Shopping cart"
        WebElement messegeHeader = driver.findElement(By.xpath("//h2[text() = ' Secure Area']"));
        String headerText1 = messegeHeader.getText();
        Assert.assertEquals("The Secure Area text is not as expected", "Shopping cart", headerText1);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        driver.findElement(By.xpath("#quantity-up-11264")).click();
        //2.17 Verify the Toztal"$2,950.00"
        WebElement expectedPrice = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        String   actPrice= expectedPrice.getText();
        Assert.assertEquals("The Secure Area text is not as expected", "$1470", actPrice);
        //2.18 click on checkbox “I agree with the terms of service”
        driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
        //2.19 Click on “CHECKOUT”
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        //2.20 Verify the Text “Welcome, Please Sign In!”
        WebElement expWelcomtext = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String   ectualWelcomeText = expWelcomtext.getText();
        Assert.assertEquals("messege not displayed",expWelcomtext,ectualWelcomeText);
        //2.21Click on “CHECKOUT AS GUEST” Tab
        driver.findElement(By.xpath("//button[contains(text(),'Checkout as Guest')]")).click();
        //2.22 Fill the all mandatory field
        sendTextToElement(By.id("BillingNewAddress_FirstName"),"Chetan");
        sendTextToElement(By.id("BillingNewAddress_LastName"),"Patel");
        sendTextToElement(By.id("BillingNewAddress_Email"),"sutton123@gmail.com");
        sendTextToElement(By.xpath("//select[@id='BillingNewAddress_CountryId']//"),"United Kingdom");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_City']"),"London");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"123 Sutton");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"SM!!PP");
        sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"7712345671");

        //2.23 Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[2]"));
        //2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(By.cssSelector("#shippingoption_1"));
        //2.25 Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
        //2.26 Select Radio Button “Credit Card”
        clickOnElement(By.xpath("#paymentmethod_1"));
        //2.27 Select “Master card” From Select credit card dropdown
        clickOnElement(By.xpath("//select[@id='CreditCardType']"));
        selectByVisibleTextFromDropDown(By.xpath("//option[contains(text(),'Master card')]"),"Master card");
        //2.28 Fill all the details
        sendTextToElement(By.id("CardholderName"),"Chetan");
        sendTextToElement(By.id("CardNumber"),"1234567890134123");
        selectByIndexFromDropDown(By.id("ExpireMonth"),01);
        selectByIndexFromDropDown(By.id("ExpireYear"),2025);
        sendTextToElement(By.id("CardCode"),"001");
        //2.29 Click on “CONTINUE”
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
        //2.30 Verify “Payment Method” is “Credit Card”
        WebElement extectedtext4 = driver.findElement(By.xpath("//label[contains(text(),'Credit Card')]"));
        String   actualText4 = extectedtext4.getText();
        Assert.assertEquals("messege not displayed",extectedtext4,actualText4);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        WebElement extectedtext3 = driver.findElement(By.xpath("//label[contains(text(),'Next Day Air ($0.00)')]"));
        String   actualText3 = extectedtext3.getText();
        Assert.assertEquals("messege not displayed",extectedtext3,actualText3);

        //2.33 Verify Total is “$2,950.00”
        WebElement extectedtext5 = driver.findElement(By.xpath("//tbody/tr[1]/td[6]/span[1]"));
        WebElement actualText5 = driver.findElement(By.cssSelector("//tbody/tr[1]/td[6]"));
        Assert.assertEquals("messege not displayed",extectedtext5,actualText5);

        //2.34 Click on “CONFIRM”
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));


        //2.35 Verify the Text “Thank You”
        WebElement extectedtext6 = driver.findElement(By.xpath("//h1[contains(text(),'Thank you')]"));
        String   actualText6 = extectedtext6.getText();
        Assert.assertEquals("messege not displayed",extectedtext6,actualText6);


        //2.36 Verify the message “Your order has been successfully processed!”
        WebElement extectedtext7 = driver.findElement(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"));
        String   actualText7 = extectedtext7.getText();
        Assert.assertEquals("messege not displayed",extectedtext7,actualText7);

        //2.37 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
        //2.37 Verify the text “Welcome to our store”
        WebElement extectedtext8 = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
        String   actualText8 = extectedtext8.getText();
        Assert.assertEquals("messege not displayed",extectedtext8,actualText8);
    }
@After
        public void tearoff(){
    driver.close();

            }
}
