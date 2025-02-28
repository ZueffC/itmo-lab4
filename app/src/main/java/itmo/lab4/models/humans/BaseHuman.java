package itmo.lab4.models.humans;

import itmo.lab4.models.moove.Destination;

abstract class BaseHuman { 
    private HumanMoods mood;
    private Destination destination;
    
    public abstract String shout();
    public abstract String walk();
}
