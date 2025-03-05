package itmo.lab4.models.land;

import itmo.lab4.interfaces.Browsable;

public record Island(String name) implements Browsable {
    public Island() {
        this("остров");
    }

    @Override
    public String lookAround() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

