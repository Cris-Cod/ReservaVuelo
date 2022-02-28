package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class vueloReserva extends PageObject {

    public void cerrarToopLip(){
        $(By.cssSelector("div.login-incentive i.login-incentive--close")).click();
    }

    public void origen(){
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input")).type("Cali, Valle del Cauca, Colombia");
        WebDriverWait wait2 = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[1]/div/input")).sendKeys(Keys.ENTER);
    }

    public void destino(){
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(50));
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input")).type("Nueva York, Nueva York, Estados Unidos");
        WebDriverWait waitOne = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
        $(By.xpath("//*[@id=\"searchbox-sbox-box-flights\"]/div/div[2]/div[1]/div[1]/div[1]/div/div[2]/div/div/input")).sendKeys(Keys.ENTER);
        WebDriverWait waitTwo = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
    }

    /*public void caldendarida(){
        $(By.cssSelector("input[placeholder='Ida']")).click();
    }*/

    public void fechas(){

        String month = "Marzo";
        String year = "2022";
        String day = "7";

        getDriver().findElement(By.cssSelector("input[placeholder='Ida']")).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

        String mes1 = getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
        System.out.println(mes1);


            while(true) {
                String mes = getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
                String atext = getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).getText();
                if(mes.equals(month) && atext.equals(year)) {
                    break;
                }else {
                    getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/a[2]")).click();
                }
            }

            getDriver().findElement(By.xpath("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[6]")).click();

            String monthArrieved = "Octubre";
            String yearArrived = "2022";


            List <WebElement> vuelta =	getDriver().findElements(By.xpath("//input[@placeholder='Vuelta']"));
            if(vuelta.size() > 0) {

                vuelta.get(0).click();
                while(true) {
                    String mesArrived = getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
                    String atextArrived = getDriver().findElement(By.xpath("//*[@id=\"component-modals\"]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]")).getText();
                    if(mesArrived.equals(monthArrieved) && atextArrived.equals(yearArrived )) {
                        break;
                    }else {
                        getDriver().findElement(By.className("calendar-arrow-right")).click();
                    }
                }


                getDriver().findElement(By.xpath("//body/div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[6]")).click();

            }

    }

    public void btnBuscar(){
        $(By.className("sbox5-button-container--1X4O8")).click();
    }

    public void duracion(){
        //$(By.xpath("//*[@id=\"filter-duration\"]")).click();
        Select ordenar = new Select(getDriver().findElement(By.xpath("/html/body/div[13]/div/div/div/div[3]/div/div[1]/div[1]/span/filters/div/div/div/sorting-selector/div/div/div/select")));
        ordenar.selectByValue("duration_ascending");
    }

    public void btnDuracion(){
        $(By.xpath("//*[@id=\"filter-duration\"]/li/ul/div[1]/slider-filter/filter-container/div/div[2]/ul/li[1]/slider/div/div")).sendKeys(Keys.ARROW_LEFT);
    }

    public String horario(){
        return $(By.cssSelector("li.time div.item-label")).getText();
    }

    public String precio(){
        return $(By.cssSelector("li.priceRange div.item-label")).getText();
    }

    public void btnComprar(){
        $(By.xpath("/html/body/div[13]/div/div/div/div[3]/div/div[2]/div/div[4]/app-root/app-common/items/div/span[1]/div/span/cluster/div/div/div[2]/fare/span/span/div[2]/buy-button/a/div/em")).click();
    }


}
