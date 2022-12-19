package InterfejsyPolimorfizm;


public class WebDriverTest {
    public static void main(String[] args) {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();

//
//        FirefoxDriver firefox = new FirefoxDriver();
//        firefox.get();
//        firefox.findElementBy();

    }

    private static WebDriver getDriver(String name) {
        if (name.equals("chrome")) {
            System.out.println(name);
            return new ChromeDriver();

        } else if (name.equals("firefox")) {
            System.out.println(name);
            return new FirefoxDriver();
        }
        return null;
    }
    }



