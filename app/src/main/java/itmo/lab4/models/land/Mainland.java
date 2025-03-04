package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;
import java.util.Objects;

public class Mainland implements Browsable {
    private final String name = "материк";
    
    @Override
    public String lookAround() {
        return this.name;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
   
    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mainland other = (Mainland) obj;
        return Objects.equals(this.name, other.name);
    }
    
    public Mainland() {} 
}
