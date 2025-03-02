package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public class Mainland implements Browsable {
    @Override
    public String lookAround() {
        return "материк";
    }
    
    public Mainland() {} 
}
