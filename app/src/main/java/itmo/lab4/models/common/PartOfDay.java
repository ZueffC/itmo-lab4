package itmo.lab4.models.common;

public enum PartOfDay {
   MORNING("утро"),
   AFTERNOON("день"),
   EVENING("вечер"),
   NIGHT("ночь");
   
   private final String description;
   
   PartOfDay(String description) {
      this.description = description;
   } 
   
   @Override
   public String toString() {
       return this.description;
   }
}