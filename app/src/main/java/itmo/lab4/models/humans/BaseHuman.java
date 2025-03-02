package itmo.lab4.models.humans;

abstract class BaseHuman { 
    protected HumanMoods mood;
    
    public abstract String shout();
    public abstract String notice();
    public abstract String walk();
}
