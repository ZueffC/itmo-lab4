package itmo.lab4.models.weather;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.Damageable;
import itmo.lab4.models.transport.BaseTransport;

public class Storm implements Damageable {
    private byte strength = 0;
    
    public Storm(byte strength) {
        this.strength = strength;
    }

    @Override
    public void affectTransport(BaseTransport transport) throws ShipDestroyedException {
        transport.takeDamage(strength);
    }
    
    @Override
    public String toString() {
        return "В море бушевал шторм, каких мы давно не видели.";
    }
}