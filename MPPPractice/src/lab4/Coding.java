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
public class Coding extends Task {
    private int linesOfCode;
    private double costPerLine;

    public Coding(String name, int duration,int linesOfCode, double costPerLine,Project pr) {
        super(name,duration,pr);
        this.linesOfCode = linesOfCode;
        this.costPerLine = costPerLine;
    }

    public double getCostPerLine() {
        return costPerLine;
    }

    public int getLinesOfCode() {
        return linesOfCode;
    }
    public double calculateCost(){
        return linesOfCode*costPerLine;
    }
}
