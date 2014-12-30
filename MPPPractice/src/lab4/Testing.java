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
public class Testing extends Task{
    private int numTestCases;
    private double costPerTestCase;

    public Testing(String name, int duration,int numTestCases, double costPerTestCase,Project pr) {
        super(name,duration,pr);
        this.numTestCases = numTestCases;
        this.costPerTestCase = costPerTestCase;
    }

    public double getCostPerTestCase() {
        return costPerTestCase;
    }

    public int getNumTestCases() {
        return numTestCases;
    }
    public double calculateCost(){
        return numTestCases*costPerTestCase;
    }
    
}
