package Pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import generic_files.Base_Page;

public class Pom extends Base_Page{

    @FindBy(name="email")
    private WebElement uName;
    @FindBy(name="pass")
    private WebElement pWord;
    @FindBy(name="login")
    private WebElement loginBtn;
    
    public Pom(WebDriver driver)
    {
    	super(driver);
    }
    public void passUn(String un)
    {
    	uName.sendKeys(un);
    }
    public void passPwd(String pwd)
    {
    	pWord.sendKeys(pwd);
    }
    public void clickBtn()
    {
    	loginBtn.click();
    }
    
    }


