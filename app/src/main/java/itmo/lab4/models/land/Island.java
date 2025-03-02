package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public class Island implements Browsable {
    @Override
    public String lookAround() { return "остров"; }
    
    public Island() {}
}
