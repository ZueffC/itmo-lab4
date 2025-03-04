package itmo.lab4.models.transport.locations;

public enum ShipLocations {
    DECK("палуба"),
    CABIN("каюта"),
    HOLD("трюм");
    
    private final String location; 
    
    ShipLocations(String locationName) {
        this.location = locationName;
    }
    
    @Override
    public String toString() {
        return this.location;
    }
}
