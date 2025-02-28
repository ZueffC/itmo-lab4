package itmo.lab4.models.humans;

public class Sailor extends BaseHuman {
    @Override
    public String walk() {
        return "Nothing";
    }
    
    @Override
    public String shout() {
        return "AAAAA!";
    }
}
