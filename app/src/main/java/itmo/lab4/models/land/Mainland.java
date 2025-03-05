package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public record Mainland(String name) implements Browsable {
    public Mainland() {
      this("материк");
    }

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
        return this.name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (obj instanceof Mainland);
    }
}

