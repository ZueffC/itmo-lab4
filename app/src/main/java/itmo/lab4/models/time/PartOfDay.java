package itmo.lab4.models.time;

import java.util.Random;

public enum PartOfDay {
   MORNING("Наступило утро. "),
   AFTERNOON("Был день. "),
   EVENING("Наступил вечер. "),
   NIGHT("На дворе была ночь. ");
   
    private final String description;
    private static final Random rng = new Random();

    PartOfDay(String description) {
        this.description = description;
    } 
    
    public static PartOfDay getRandom() {
        PartOfDay[] parts = values();
        return parts[rng.nextInt(parts.length)];
    }

    @Override
    public String toString() {
      return this.description;
    }
}
