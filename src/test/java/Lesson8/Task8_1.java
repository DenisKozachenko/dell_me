package Lesson8;

import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class Task8_1 {

    @Test
    public void startTest(){
        //open("https://www.google.ru/intl/ru/chrome/");
        open("http://automationpractice.com/index.php?controller=authentication&back=my-account#accountcreation");

        // Xpath selectors
        $(By.xpath("//a[@title='Contact Us']")).waitUntil(Condition.visible,15000);
        $(By.xpath("//a[@rel='nofollow']")).waitUntil(Condition.visible,15000);
        $(By.xpath("//img[@class='img-responsive']")).waitUntil(Condition.visible,15000);
        $(By.xpath("//div[@class='nav']/div[@class='container']/div[@class='row']"));
        $(By.xpath("//div[@class='shopping_cart']/a[@title='View my shopping cart']"));
        $(By.xpath("//button[@name='submit_search']"));
        $(By.xpath("//input[@placeholder='Search']"));
        $(By.xpath("//img[@alt='My Store']"));
        $(By.xpath("//a[@title='Women']"));
        $(By.xpath("//a[@title='Dresses']"));
        $(By.xpath("//a[@title='T-shirts']"));
        $(By.xpath("//a[@title='Return to Home']/i"));
        $(By.xpath("//div[@class='breadcrumb clearfix']/span[@class='navigation_page']")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//div[@id='center_column']/h1")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='create-account_form']/h3")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//div[@class='form_content clearfix']/child::p")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//div[@class='form_content clearfix']/div/child::label")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//div[@class='form_content clearfix']/div/child::input")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//div[@class='submit']/button")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/h3")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div/label")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div/input")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div/div/label")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div[2]/span/child::input")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div[2]/following-sibling::p/child::a")).waitUntil(Condition.visible,15000).click();
        $(By.xpath("//form[@id='login_form']/div/div[2]/following-sibling::p[2]/button")).waitUntil(Condition.visible,15000).click();



        // CSS selectors

        $(By.cssSelector("img.img-responsive")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("a#nofollow")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("img.img-responsive")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.nav>div.container>div.row")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.shopping_cart > a[title = View my shopping cart]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("button[name =submit_search]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("input[placeholder = Search]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("img[alt = My Store]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("a[title = Dresses]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("a[title = Women]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("a[title = T-shirts]")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("a[title = Return to Home] > i")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.breadcrumb clearfix > span.navigation_page")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div#center_column > h1")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#create-account_form > h3")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.form_content clearfix  > p")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.form_content clearfix > div > label")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.form_content clearfix > div > input")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("div.submit > button")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > h3")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div > label")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div > input")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div > div> label")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div + div > span > input")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div + div +p > a")).waitUntil(Condition.visible,15000);
        $(By.cssSelector("form#login_form > div > div + div +p + p > button")).waitUntil(Condition.visible,15000);
    }
}
