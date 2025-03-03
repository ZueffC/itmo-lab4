package itmo.lab4.models.scene;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.models.weather.WeatherFactory;
import itmo.lab4.models.time.PartOfDay;
import itmo.lab4.models.transport.Ship;
import itmo.lab4.models.land.*;

public class Scene {
    private StringBuilder story;
    
    public String getStory() {
        var partOfDay = PartOfDay.MORNING;
        var weather = new WeatherFactory((byte) 10).getAppropriateWeather();
        var ship = new Ship("корабль", (byte) 100);
        var land = new LandFactory((byte) 50).getAppropriateLand();
        var shoal = new Shoal();
        
        story = new StringBuilder();
    
        story.append(partOfDay.toString());
        
        try {
            story.append(weather.toString());
            weather.affectTransport(ship);
        } catch (ShipDestroyedException e) {
            story.append(e.toString());
            return story.toString();
        }

        
        story.append("Один из матросов, стоящих на мачте, громко кринул: \"Земля!\". ");
        story.append(String.format(
            "Никто тогда не мог предположить, что земля, которую мы увидели вдали, " +
            "представляет собой %s. ", land.lookAround())
        );
        
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
       
        story.append(ship.healthStatus());
        
        var mood = ship.getSailors().getMood().toString();
        story.append("Мы были ").append(mood).append(". ");   

        return story.toString();
    }
}
