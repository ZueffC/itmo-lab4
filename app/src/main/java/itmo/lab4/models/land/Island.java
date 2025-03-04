package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public class Island implements Browsable {
    private String name = "остров";
    @Override
    public String lookAround() { 
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    public Island() {}
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Island island = (Island) obj;
        return name != null ? name.equals(island.name) : island.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
