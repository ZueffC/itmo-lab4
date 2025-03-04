package itmo.lab4.models.land;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.*;
import itmo.lab4.models.transport.BaseTransport;
import java.util.Random;

public class Shoal implements Damageable {
    @Override
    public String toString() {
       return "Неожиданно, судно село на мель.";
    }
    
    public Shoal() {}

    @Override
    public void affectTransport(BaseTransport transport) throws ShipDestroyedException {
        transport.takeDamage((byte) (transport.getOriginalHealth() / 2));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj instanceof Shoal;
    }

    @Override
    public int hashCode() {
        int hash = (new Random()).nextInt();
        return hash;
    }
}
