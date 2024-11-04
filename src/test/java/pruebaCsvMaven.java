import org.junit.Test;
import org.pruebaCsvMaven.Main;

import static org.junit.Assert.*;

public class pruebaCsvMaven {

    @Test
    public void testGetRecommendationSunnyAndWarm() {
        assertEquals("Perfecto para hacer un picnic", WeatherApp.getRecommendation(25, "soleado"));
    }

    @Test
    public void testGetRecommendationColdAndRainy() {
        assertEquals("Abrígate y lleva paraguas", WeatherApp.getRecommendation(5, "lluvioso"));
    }

    @Test
    public void testGetRecommendationHotAndSunny() {
        assertEquals("Lleva gorra y protector solar", WeatherApp.getRecommendation(30, "soleado"));
    }
}

