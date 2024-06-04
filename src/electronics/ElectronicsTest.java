package electronics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class ElectronicsTest extends Utility {
    //● Create package Electronics

    //1. Create the class ElectronicsTest
    @Before
    public void setUp(){
        setBaseUrl();
    }

    //Write the following test
    //1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {

        //1.1 Mouse Hover on “Electronics” Tab
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        //1.2 Mouse Hover on “Cell phones” and click
        mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        //1.3 Verify the text “Cell phones”
        WebElement pageHead = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        String headerText = pageHead.getText();
        Assert.assertEquals("The page is not as expected", "Cell phones", headerText);
    }
        @Test
        //2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
        public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {

            //2.1 Mouse Hover on “Electronics” Tab
            mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

            //2.2 Mouse Hover on “Cell phones” and click
           mouseHoverToElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));

            //2.3 Verify the text “Cell phones”
            WebElement pageHead = driver.findElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
            String headerText = pageHead.getText();
            Assert.assertEquals("The page is not as expected", "Cell phones", headerText);
            //2.4 Click on List View Tab
            clickOnElement(By.xpath("//a[contains(text(),'List')]"));
            //2.5 Click on product name “Nokia Lumia 1020” link
            clickOnElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
            //2.6 Verify the text “Nokia Lumia 1020”
            WebElement pageHead1 = driver.findElement(By.xpath("//a[contains(text(),'Nokia Lumia 1020')]"));
            String headerText1 = pageHead1.getText();
            Assert.assertEquals("The page is not as expected", "Nokia Lumia 1020", headerText1);
            //2.7 Verify the price “$349.00”
            WebElement pageHead2 = driver.findElement(By.xpath("//span[contains(text(),'$349.00')]"));
            String headerText2 = pageHead2.getText();
            Assert.assertEquals("The page is not as expected", "$349.00", headerText2);

            //2.8 Change quantity to 2
            WebElement quantityBox = driver.findElement(By.cssSelector("#product_enteredQuantity_20"));
            quantityBox.clear();
            quantityBox.sendKeys("2");

            //2.9 Click on “ADD TO CART” tab
            clickOnElement(By.xpath("//button[@id='add-to-cart-button-20']"));
            //2.10 Verify the Message "The product has been added to your shopping cart" on Top
            //green Bar
            verifyExpectedAndActual(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"),"The product has been added to your ");

            //After that close the bar clicking on the cross button.
            clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
            //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
            mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
            mouseHoverToElement(By.xpath("//button[contains(text(),'Go to cart')]"));
            clickOnElement(By.xpath("//button[contains(text(),'Go to cart')]"));
            //2.12 Verify the message "Shopping cart"
            verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart");
            //2.13 Verify the quantity is 2
            WebElement quantity = driver.findElement(By.id("itemquantity11268"));
            assert quantity.getText().equals("2");

            //2.14 Verify the Total $698.00
            WebElement total = driver.findElement(By.xpath("//tbody/tr[4]/td[2]/span[1]/strong[1]"));
            assert total.getText().equals("$698.00");

            //2.15 click on checkbox “I agree with the terms of service”
            clickOnElement(By.xpath("//input[@id='termsofservice']"));
            //2.16 Click on “CHECKOUT”
            clickOnElement(By.xpath("//button[@id='checkout']"));
            //2.17 Verify the Text “Welcome, Please Sign In!”
           verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"),"Welcome, Please Sign In!");
            //2.18 Click on “REGISTER” tab
            clickOnElement(By.xpath("//button[contains(text(),'Register')]"));
            //2.19 Verify the text “Register”
            verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Register')]"),"Register");
            //2.20 Fill the mandatory fields
            mouseHoverToElement(By.xpath("//input[@id='gender-male']"));
            clickOnElement(By.xpath("//input[@id='gender-male']"));
            sendTextToElement(By.xpath("//input[@id='FirstName']"),"chetan");
            sendTextToElement(By.xpath("//input[@id='LastName']"),"patel");
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));
            selectByIndexFromDropDown(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]/option[16]"),15);
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
            selectByIndexFromDropDown(By.xpath("//option[contains(text(),'December')]"),12);
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
            selectByIndexFromDropDown(By.xpath("//option[contains(text(),'1980')]"),1981);
            clickOnElement(By.xpath("//input[@id='Email']"));
            sendTextToElement(By.cssSelector("#Email"),"chetan123@gmail.com");
            clickOnElement(By.xpath("//input[@id='Newsletter']"));
            sendTextToElement(By.xpath("//input[@id='Password']"),"chetan123");
            sendTextToElement(By.xpath("//input[@id='ConfirmPassword']"),"chetan123");

            //2.21 Click on “REGISTER” Button
            clickOnElement(By.xpath("//button[@id='register-button']"));
            //2.22 Verify the message “Your registration completed”
            verifyExpectedAndActual(By.xpath("//div[contains(text(),'Your registration completed')]"),"Your registration completed");
            //2.23 Click on “CONTINUE” tab
            clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
            //2.24 Verify the text “Shopping card”
            verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Shopping cart')]"),"Shopping cart");
            //2.25 click on checkbox “I agree with the terms of service”
            clickOnElement(By.xpath("//input[@id='termsofservice']"));
            //2.26 Click on “CHECKOUT”
            clickOnElement(By.xpath("//button[@id='checkout']"));
            //2.27 Fill the Mandatory fields
            clickOnElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
            selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"United Kingdom");
            clickOnElement(By.xpath("//select[@id='BillingNewAddress_City']"));
            selectByValueFromDropDown(By.xpath("//select[@id='BillingNewAddress_City']"),"London");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_Address1']"),"123Sutton High street");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']"),"Sm11qr");
            sendTextToElement(By.xpath("//input[@id='BillingNewAddress_PhoneNumber']"),"07412345692");
            //2.28 Click on “CONTINUE”
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[2]"));
            //2.29 Click on Radio Button “2nd Day Air ($0.00)”
            clickOnElement(By.xpath("//input[@id='shippingoption_2']"));
            //2.30 Click on “CONTINUE”
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
            //2.31 Select Radio Button “Credit Card”
            selectOptionByContainsText(By.xpath("//input[@id='paymentmethod_1']"),"Credit Card");
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
            //2.32 Select “Visa” From Select credit card dropdown
            selectByValueFromDropDown(By.xpath("//select[@id='CreditCardType']"),"Visa");

            //2.33 Fill all the details
            sendTextToElement(By.xpath("//input[@id='CardholderName']"),"chetan patel");
            sendTextToElement(By.xpath("//input[@id='CardNumber']"),"5555123445671234");
            selectByIndexFromDropDown(By.xpath("//select[@id='ExpireMonth']"),01);
            selectByIndexFromDropDown(By.xpath("//select[@id='ExpireYear']"),2025);
            sendTextToElement(By.xpath("//input[@id='CardCode']"),"302");

            //2.34 Click on “CONTINUE”
            clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));
            //2.35 Verify “Payment Method” is “Credit Card”
            verifyExpectedAndActual(By.xpath("//span[contains(text(),'Credit Card')]"),"Credit Card");
            //2.36 Verify “Shipping Method” is “2nd Day Air”
            verifyExpectedAndActual(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"),"2nd Day Air");
            //2.37 Verify Total is “$698.00”
            verifyExpectedAndActual(By.xpath("//tbody/tr[1]/td[6]/span[1]"),"$698.00");
            //2.38 Click on “CONFIRM”
            clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
            //2.39 Verify the Text “Thank You”
            verifyExpectedAndActual(By.xpath("//h1[contains(text(),'Thank you')]"),"Thank you");

            //2.40 Verify the message “Your order has been successfully processed!”
            verifyMessage("Your order has been successfully processed!","Your order has been successfully processed!");
            //2.41 Click on “CONTINUE”
            clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
            //2.42 Verify the text “Welcome to our store”
            verifyExpectedAndActual(By.xpath("//h2[contains(text(),'Welcome to our store')]"),"Welcome to our store");
            //2.43 Click on “Logout” link
            clickOnElement(By.xpath("//a[contains(text(),'Log out')]"));
            //2.44 Verify the URL is “https://demo.nopcommerce.com/”
            verifyExpectedAndActual(By.xpath("//body/div[6]/div[4]/div[2]/div[2]/a[1]"),"href=https://www.nopcommerce.com/");
        }

}
