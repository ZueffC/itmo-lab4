package itmo.lab4.models.transport;

import itmo.lab4.exceptions.ShipDestroyedException;

public abstract class BaseTransport { 
    protected String name;
    protected byte original_health;
    protected byte health;
    
    public BaseTransport(String name, byte health) {
        this.name = name; 
        
        this.health = health;
        this.original_health = health;
    }
    
    public byte getHealth() {
        return this.health;
    }
    
    public byte getOriginalHealth() {
        return this.original_health;
    }
    
   public byte getHealthCoefficient() {
       return (byte) (this.health / this.original_health);
   }
    
    public abstract void takeDamage(byte damage) throws ShipDestroyedException;
}
