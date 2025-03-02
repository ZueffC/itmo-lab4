package itmo.lab4.models.land;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.*;
import itmo.lab4.models.transport.BaseTransport;

public class Shoal implements Browsable, Damageable {
    @Override
    public String lookAround() {
       return "Неожиданно, судно село на мель.";
    }
    
    public Shoal() {}

    @Override
    public void affectTransport(BaseTransport transport) throws ShipDestroyedException {
        transport.takeDamage((byte) (transport.getOriginalHealth() / 2));
    }
}
