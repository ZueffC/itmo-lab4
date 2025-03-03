package itmo.lab4.models.humans;

public enum HumanMoods {
    Happy("рады"), 
    Worry("испуганы");
    
    private final String description;
    
    HumanMoods(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}
