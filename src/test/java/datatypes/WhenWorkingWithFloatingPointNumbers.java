package datatypes;

import org.junit.Test;


public class WhenWorkingWithFloatingPointNumbers {
    @Test
    public void covertCelsiusToFahrenheit(){
        float tempInCentigrade = 47.857F;
        float tempInFahrenheit = (tempInCentigrade * 1.8F) + 32.0F;
        System.out.println("Temperature in Fahrenheit is " + tempInFahrenheit +"F");
    }
    @Test
    public void convertKilogramToPounds(){
        float weightInKilograms = 65.0F;
        float weightInPounds = weightInKilograms * 2.205F;
        System.out.println("Weight in Pounds is " + weightInPounds +"lbs");
    }
}
