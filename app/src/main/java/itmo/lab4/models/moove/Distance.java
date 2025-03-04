package itmo.lab4.models.moove;

public enum Distance {
    FAR_AWAY("далеко"),
    IN_BETWEEN("не некотором удалении"),
    CLOSE("близко");
    
    private final String distance;
    
    Distance(String distance) {
        this.distance = distance;
    }
    
    @Override
    public String toString() {
        return this.distance;
    }
}
