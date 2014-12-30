/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author rmsor_000
 */
abstract class Task {
    String name;
    int duration;
    private Project pr;

    public Task(String name, int duration,Project pr) {
        this.name = name;
        this.duration = duration;
        this.pr=pr;
    }

    public int getDuration() {
        return duration;
    }

    public String getName() {
        return name;
    }
    
    abstract double calculateCost();
}
