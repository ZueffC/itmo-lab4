package itmo.lab4.models.time;

public enum PartOfDay {
   MORNING("Наступило утро. "),
   AFTERNOON("Был день. "),
   EVENING("Наступил вечер."),
   NIGHT("На дворе была ночь. ");
   
   private final String description;
   
   PartOfDay(String description) {
      this.description = description;
   } 
   
   @Override
   public String toString() {
       return this.description;
   }
}