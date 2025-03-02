package itmo.lab4.models.moove;

public enum Distance {
    FAR_AWAY("далеко");
    
    private String distance;
    
    Distance(String distance) {
        this.distance = distance;
    }
    
    @Override
    public String toString() {
        return this.distance;
    }
}
