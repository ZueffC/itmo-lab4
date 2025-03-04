package itmo.lab4.models.transport.locations;

import java.util.Random;

public enum ShipLocations {
    DECK("палуба"),
    CABIN("каюта"),
    HOLD("трюм");
    
    private final String location; 
    private final static Random rng = new Random(); 

    ShipLocations(String locationName) {
        this.location = locationName;
    }
  
    public static ShipLocations getRandom() {
        ShipLocations[] locations = values();
        return locations[rng.nextInt(locations.length)];
    }

    @Override
    public String toString() {
        return this.location;
    }
}
