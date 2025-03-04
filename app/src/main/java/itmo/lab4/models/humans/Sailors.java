package itmo.lab4.models.humans;

import itmo.lab4.models.transport.BaseTransport;
import itmo.lab4.interfaces.Browsable;

public class Sailors extends BaseHuman {
    @Override
    public String walk(BaseTransport transport) {
        return transport.hide();
    }
    
    public Sailors() {
        this.mood = HumanMoods.Calm;
    }
    
    public HumanMoods getMood() {
        return this.mood;
    }
    
    public void setMood(HumanMoods newMood) {
        this.mood = newMood;
    }
    
    @Override    
    public String notice(Browsable browsable) {
        return String.format(
            "Никто тогда не мог предположить, что земля, которую мы увидели вдали, " +
            "представляет собой %s. ", browsable.lookAround()
        );
    }
}
