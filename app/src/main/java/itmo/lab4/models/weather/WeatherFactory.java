package itmo.lab4.models.weather;

import itmo.lab4.interfaces.Damageable;

public class WeatherFactory {
    private byte strength = 0;
    
    public WeatherFactory(byte strength) {
        this.strength = strength; 
    }
    
    public Damageable getAppropriateWeather() {
        return (this.strength >= 50) ? new Storm(this.strength) : new Wind(this.strength);
    }
}
