package itmo.lab4.models.weather;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.Damageable;
import itmo.lab4.models.transport.BaseTransport;
import java.util.Objects;

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
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Storm storm = (Storm) obj;
        return strength == storm.strength;
    }

    @Override
    public int hashCode() {
        return Objects.hash(strength);
    }
}