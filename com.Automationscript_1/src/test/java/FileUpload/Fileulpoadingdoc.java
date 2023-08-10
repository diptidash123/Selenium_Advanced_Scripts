//package FileUpload;
//
//public class Fileulpoadingdoc {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		public static void main(String[] args) throws InterruptedException {
//			        System.setProperty("webdriver.gecko.driver", "./Dribvers1/geckodriver.exe");
//			        WebDriver  driver = new FirefoxDriver();
//			        driver.get("https://www.naukri.com/");
//			        //Click on login
//			        driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
//
//			        Thread.sleep(2000);
//			        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[2]/input")).sendKeys("gayatrimis1@gmail.com");
//			        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[3]/input")).sendKeys("user123naukri");
//			        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/div/div/div[2]/div/form/div[6]/button")).click();     
//
//			        /*
//			        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[1]/div[1]")).click();
//			        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/a")).click();
//
//			        */
//			        Thread.sleep(2000);
//			        // Mousehover
//			        WebElement el = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div/div[1]"));
//
//			        Actions act = new Actions(driver);
//			        act.moveToElement(el).build();
//
//			        el.click();
//
//			        Thread.sleep(2000);
//			        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[3]/div[2]/div[2]/div/div[1]/div[2]/a")).click();
//
//			        // Click on update resume
//
//			        driver.findElement(By.xpath("//*[@id=\"attachCV\"]")).click();
//
//			        Thread.sleep(2000);
//
//			        // click on cross
//			        driver.findElement(By.xpath("/html/body/div[8]/div/div[1]/div[1]/div")).click();
//
//			    }
//			}
//	}
//
//}
