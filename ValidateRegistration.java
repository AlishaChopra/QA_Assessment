package practice;



public class ValidateRegistration {
	
	@Test
	public void VerifyElementsOnPage()
	{
		String baseUrl = "https://www.rabbitsreviews.com/Default.aspx";					
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();					
	    		
	    driver.get(baseUrl);
	    WebElement findSignup = driver.findElement(By.linkText("sign up")).click();	
	    findSignup.isDisplayed();
	    
	    WebElement findNickName = driver.findElement(By.id("fos_user_registration_form_username"));	
	    findNickName.isDisplayed();
	    
	    WebElement findEmail = driver.findElement(By.id("fos_user_registration_form_email"));	
	    findEmail.isDisplayed();
	    
	    WebElement findPassword = driver.findElement(By.id("fos_user_registration_form_password"));	
	    findPassword.isDisplayed();
	    
	    WebElement findCaptcha = driver.findElement(By.id("recaptcha-anchor"));	
	    findCaptcha.isDisplayed();
	    
	    WebElement findHasAgreed = driver.findElement(By.id("fos_user_registration_form_hasAgreedToTerms"));	
	    findHasAgreed.findHasAgreed();
	    
	    WebElement findSubscribe = driver.findElement(By.id("fos_user_registration_form_isSubscribed"));	
	    findSubscribe.isDisplayed();
	    
	    WebElement findRegistrationButton = driver.findElement(By.id("registration"));	
	    findRegistrationButton.isDisplayed();
	      
	}
	
	@Test
	public void validRegistrationTest()
	{ 
		String baseUrl = "https://www.rabbitsreviews.com/Default.aspx";					
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
		
		WebElement findSignup = driver.findElement(By.linkText("sign up")).click();	
	    findSignup.isDisplayed();
	    
	    WebElement findNickName = driver.findElement(By.id("fos_user_registration_form_username"));	
	    findNickName.sendKeys("NA6");
	    
	    WebElement findEmail = driver.findElement(By.id("fos_user_registration_form_email"));	
	    findEmail.sendkeys("alishachopra0426@gmail.com");
	    
	    WebElement findPassword = driver.findElement(By.id("fos_user_registration_form_password"));	
	    findPassword.send("Alisha@1234");
	    
	    WebElement findCaptcha = driver.findElement(By.id("recaptcha-anchor"));	
	    findCaptcha.click();
	    
	    WebElement findHasAgreed = driver.findElement(By.id("fos_user_registration_form_hasAgreedToTerms"));	
	    findHasAgreed.click();
	    
	    WebElement findSubscribe = driver.findElement(By.id("fos_user_registration_form_isSubscribed"));	
	    findSubscribe.isDisplayed();
	    
	    WebElement findRegistrationButton = driver.findElement(By.id("registration"));	
	    findRegistrationButton.click();
	    String expectedURL = "https://www.rabbitsreviews.com/Default.aspx";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	}
	
	@Test
	 public void emailAlreadyExists()
	 {
		
		String baseUrl = "https://www.rabbitsreviews.com/Default.aspx";					
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
		
		WebElement findSignup = driver.findElement(By.linkText("sign up")).click();	
	    findSignup.isDisplayed();
	    
	    WebElement findNickName = driver.findElement(By.id("fos_user_registration_form_username"));	
	    findNickName.sendKeys("NAA");
	    
	    WebElement findEmail = driver.findElement(By.id("fos_user_registration_form_email"));	
	    findEmail.sendkeys("alishachopra0426@gmail.com");
	    
	    WebElement findPassword = driver.findElement(By.id("fos_user_registration_form_password"));	
	    findPassword.send("Alisha@1234");
	    
	    WebElement findCaptcha = driver.findElement(By.id("recaptcha-anchor"));	
	    findCaptcha.click();
	    
	    WebElement findHasAgreed = driver.findElement(By.id("fos_user_registration_form_hasAgreedToTerms"));	
	    findHasAgreed.click();
	    
	    WebElement findSubscribe = driver.findElement(By.id("fos_user_registration_form_isSubscribed"));	
	    findSubscribe.isDisplayed();
	    
	    WebElement findRegistrationButton = driver.findElement(By.id("registration"));	
	    findRegistrationButton.click();
	    String expectedMsg = "Please fix the errors marked in red";
	    
	    WebElement exp = driver.findElement(By.xpath("//div[contains(text(),'Please fix the errors marked in red')]"));
	    String actualErrorMsg = exp.getText();

	    Assert.assertEquals(actualErrorMsg, expectedMsg);
		
	 }
	
	
	@Test
	 public void emailIsEmpty()
	 {
		
		String baseUrl = "https://www.rabbitsreviews.com/Default.aspx";					
	    //System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
		
		WebElement findSignup = driver.findElement(By.linkText("sign up")).click();	
	    findSignup.isDisplayed();
	    
	    WebElement findNickName = driver.findElement(By.id("fos_user_registration_form_username"));	
	    findNickName.sendKeys("NAA");
	    
	    WebElement findEmail = driver.findElement(By.id("fos_user_registration_form_email"));	
	    findEmail.sendkeys("");
	    
	    WebElement findPassword = driver.findElement(By.id("fos_user_registration_form_password"));	
	    findPassword.send("Alisha@1234");
	    
	    WebElement findCaptcha = driver.findElement(By.id("recaptcha-anchor"));	
	    findCaptcha.click();
	    
	    WebElement findHasAgreed = driver.findElement(By.id("fos_user_registration_form_hasAgreedToTerms"));	
	    findHasAgreed.click();
	    
	    WebElement findSubscribe = driver.findElement(By.id("fos_user_registration_form_isSubscribed"));	
	    findSubscribe.isDisplayed();
	    
	    WebElement findRegistrationButton = driver.findElement(By.id("registration"));	
	    findRegistrationButton.click();
	    String expectedMsg = "Please fill out this field";
	    
	    WebElement exp = driver.findElement(By.id("fos_user_registration_form_email")).getAttribute("validationMessage");
	    String actualErrorMsg = exp.getText();

	    Assert.assertEquals(actualErrorMsg, expectedMsg);
		
	 }

	 @Test
	 public void usernameIsEmpty()
	 {
		
		String baseUrl = "https://www.rabbitsreviews.com/Default.aspx";					
	    System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");					
	    WebDriver driver = new ChromeDriver();	
		
		WebElement findSignup = driver.findElement(By.linkText("sign up")).click();	
	    findSignup.isDisplayed();
	    
	    WebElement findNickName = driver.findElement(By.id("fos_user_registration_form_username"));	
	    findNickName.sendKeys("");
	    
	    WebElement findEmail = driver.findElement(By.id("fos_user_registration_form_email"));	
	    findEmail.sendkeys("alishachopra0426@gmail.com");
	    
	    WebElement findPassword = driver.findElement(By.id("fos_user_registration_form_password"));	
	    findPassword.send("Alisha@1234");
	    
	    WebElement findCaptcha = driver.findElement(By.id("recaptcha-anchor"));	
	    findCaptcha.click();
	    
	    WebElement findHasAgreed = driver.findElement(By.id("fos_user_registration_form_hasAgreedToTerms"));	
	    findHasAgreed.click();
	    
	    WebElement findSubscribe = driver.findElement(By.id("fos_user_registration_form_isSubscribed"));	
	    findSubscribe.isDisplayed();
	    
	    WebElement findRegistrationButton = driver.findElement(By.id("registration"));	
	    findRegistrationButton.click();
	    String expectedMsg = "Please fill out this field";
	    
	    WebElement exp = driver.findElement(By.id("fos_user_registration_form_username")).getAttribute("validationMessage");
	    String actualErrorMsg = exp.getText();

	    Assert.assertEquals(actualErrorMsg, expectedMsg);
		
	 }

}
