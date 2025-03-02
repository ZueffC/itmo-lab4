package itmo.lab4.models.humans;

public class Native extends BaseHuman {    
    @Override
    public String walk() {
        return "Nothing";
    }
    
    @Override
    public String shout() {
        return "AAAAA!";
    }
    
    @Override
    public String notice() {
        return "AAAAA!";
    }
}