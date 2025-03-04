package itmo.lab4.models.humans;

import itmo.lab4.interfaces.Browsable;
import itmo.lab4.models.transport.BaseTransport;

abstract class BaseHuman { 
    protected HumanMoods mood; 
    
    public abstract String notice(Browsable browsable);
    public abstract String walk(BaseTransport transport);
}
