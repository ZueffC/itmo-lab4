package itmo.lab4.models.weather;

import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.interfaces.Damageable;
import itmo.lab4.models.transport.BaseTransport;

public class Wind implements Damageable {
    private byte strength = 0;

    public Wind(byte strength) {
        this.strength = strength;
    }
    
    @Override
    public String toString() {
        int strengthGroup = this.strength / 10;
        System.out.println(strengthGroup);
        return switch (strengthGroup) {
            case 4 -> "Корабль стонал под натиском ветра, гунись мачты. ";
            case 3 -> "Ветер накидывался на парусник, как сорвавшаяся с цепи собака. ";
            case 2 -> "Дул слабый ветер. ";
            default -> "С моря доносился лёгкий бриз. ";
        };
    }

    @Override
    public void affectTransport(BaseTransport transport) throws ShipDestroyedException {
        transport.takeDamage(strength);
    }
}
