package itmo.lab4.models.transport;

import itmo.lab4.exceptions.ShipDestroyedException;

public class Ship extends BaseTransport  {
    public Ship(String name, byte health) {
        super(name, health);
    }

    @Override
    public byte getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    
    public String healthStatus() {
        var shipHealthCoefficient = this.getHealthCoefficient();
        if(shipHealthCoefficient >= 0.6) {
            return this.name + " почти не пострадало, но слышать хруст досок было неприятно. ";
        } else if(shipHealthCoefficient >= 0.4) {
            return this.name + " было потрёпано, но смогло выстоять. ";            
        } else {
            return this.name + " сильно пострадало после встречи с мелью. ";
        }
    }
    
    @Override
    public void takeDamage(byte damage) throws ShipDestroyedException {
        this.health -= damage;
        if(health <= 0) {
            throw new ShipDestroyedException("Судно было разрушено бушующей стихией!");
        }   
    }
}