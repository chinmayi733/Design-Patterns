package org.example.Structural.Adapter;

public class Adapter implements AdapterInterface {
    WeightCalculator weightCalculator = new WeightCalculator();

    @Override
    public double calculateWeightInPounds(double weightInPounds) {
        double kgs = weightCalculator.calculateWeightInKilograms(weightInPounds);
        return kgs * 2.20462;
    }


}
