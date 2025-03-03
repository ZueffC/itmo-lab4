package itmo.lab4.models.humans;

public class Sailors extends BaseHuman {
    public String walk() {
        return "Nothing";
    }
    
    @Override
    public String shout() {
        return "AAAAA!";
    }
    
    @Override
    public String notice() {
        return "";
    }

    public HumanMoods getMood() {
        return this.mood;
    }

    public void setMood(HumanMoods newMood) {
        this.mood = newMood;
    }
}
