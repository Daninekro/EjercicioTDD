package org.pruebaCsvMaven;

public class Main {
    public class WeatherApp {

        public static String getRecommendation(int temperature, String weather) {
            if (weather.equals("soleado") && temperature >= 25) {
                return "Perfecto para hacer un picnic";
            } else if (weather.equals("lluvioso") && temperature < 10) {
                return "Abrígate y lleva paraguas";
            } else if (weather.equals("soleado") && temperature >= 30) {
                return "Lleva gorra y protector solar";
            }
            return "Disfruta tu día";
        }
    }

}
