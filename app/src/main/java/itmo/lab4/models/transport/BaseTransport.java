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
    
    public float getHealthCoefficient() {
        if (this.original_health != 0 || this.health != 0) 
            return (float) this.health / this.original_health;
        else
            return (float) 0.5;
   }
    
    public abstract String hide();
    
    public abstract void takeDamage(byte damage) throws ShipDestroyedException;
}
