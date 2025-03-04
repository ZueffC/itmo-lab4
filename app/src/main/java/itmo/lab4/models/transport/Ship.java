package itmo.lab4.models.transport;

import itmo.lab4.models.transport.locations.ShipLocations;
import itmo.lab4.exceptions.ShipDestroyedException;
import itmo.lab4.models.humans.*;

public class Ship extends BaseTransport  {
    private final Sailors sailors;
    private ShipLocations location;
    
    public Ship(String name, byte health, ShipLocations location) {
        super(name, health);
        
        this.location = location;
        this.sailors = new Sailors();
    }

    @Override
    public byte getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }
    
    public String getSailorsMood() {
        return this.sailors.getMood().toString();
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

    @Override
    public String hide() {
        var shipHealthCoefficient = this.getHealthCoefficient();
        
        if(shipHealthCoefficient >= 0.9) {
            this.sailors.setMood(HumanMoods.Calm);
            return "Мы решили остаться на " + this.location.toString();
        } else if(shipHealthCoefficient >= 0.4) {
            this.location = ShipLocations.DECK;
            this.sailors.setMood(HumanMoods.Worry);
            return "Условия вынуждали нас уйти в " 
                    + this.location.toString()
                    + ". ";        
        } else {
            this.location = ShipLocations.HOLD;
            this.sailors.setMood(HumanMoods.Panic);
            return "Бушующая стихия не оставила нам выбора: мы бросились в " 
                    + this.location.toString() 
                    + ". ";
        }
    }
}