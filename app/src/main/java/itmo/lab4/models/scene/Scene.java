package itmo.lab4.models.scene;

import itmo.lab4.models.transport.locations.ShipLocations;
import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.Browsable;
import itmo.lab4.interfaces.Damageable;
import itmo.lab4.models.weather.WeatherFactory;
import itmo.lab4.models.time.PartOfDay;
import itmo.lab4.models.transport.Ship;
import itmo.lab4.models.land.*;
import java.util.Objects;
import java.util.Random;

public class Scene {
    private StringBuilder story;
    private final static Random rng = new Random();
    
    public String getMainStory() {     
        var partOfDay = PartOfDay.MORNING;
        var weather = new WeatherFactory((byte) 10).getAppropriateWeather();
        var ship = new Ship("корабль", (byte) 100, ShipLocations.DECK);
        var land = new LandFactory((byte) 50).getAppropriateLand();
        
         return getCustomStory(partOfDay, weather, ship, land);
    }
    
    public String getRandomStory() {
        var partOfDay = PartOfDay.getRandom();
        var ship = new Ship("Рандомное судно", (byte) rng.nextInt(100), ShipLocations.getRandom());
        var land = new LandFactory((byte) rng.nextInt(100)).getAppropriateLand();
        Damageable weather = null;
        
        try {
            weather = new WeatherFactory((byte) rng.nextInt(100 + 1)).getAppropriateWeather();
        } catch (IllegalArgumentException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
        
        return getCustomStory(partOfDay, weather, ship, land);
    }
    
    public String getCustomStory(PartOfDay partOfDay, Damageable weather, Ship ship, Browsable land) {
        story = new StringBuilder();
    
        story.append(partOfDay.toString());
        story.append(
                String.format("Команда была %s. ", ship.getSailorsMood())
        );
        
        try {
            story.append(weather.toString());
            weather.affectTransport(ship);
        } catch (ShipDestroyedException e) {
            story.append(e.toString());
            return story.toString();
        }
        
        story.append("Один из матросов, стоящих на мачте, громко кринул: \"Земля!\". ");
        
        if(rng.nextBoolean()) {
            var shoal = new Shoal();
            
            try {
                story
                        .append("Неожиданно, наш ")
                        .append(ship.getName())
                        .append(" сел на мель. ");
                shoal.affectTransport(ship);
            } catch(ShipDestroyedException e) {
                story.append(e.toString());
                return story.toString();
            }
        }  
       
        story.append(ship.healthStatus());
        story.append(ship.hide());
        story.append(
                String.format("После произошедшего, команда была %s. ", ship.getSailorsMood())
        );
        
        return story.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null || getClass() != obj.getClass()) {
            return false;
        }
        
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass());
    }
}
