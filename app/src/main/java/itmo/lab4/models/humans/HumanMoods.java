/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itmo.lab4.models.humans;

public enum HumanMoods {
    Happy("счастлив"), 
    Worry("испуган");
    
    private final String description;
    
    HumanMoods(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return this.description;
    }
}