package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public class LandFactory {
    private byte chance = 0;
    
    public LandFactory(byte chance) {
        this.chance = chance;
    }
    
    public Browsable getAppropriateLand() {
        return (this.chance >= 50) ? new Island() : new Mainland();
    } 
}
