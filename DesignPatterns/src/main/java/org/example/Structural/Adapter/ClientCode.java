package org.example.Structural.Adapter;

public class ClientCode {

    public static void main(String[] args) {
        WeightCalculator weightCalculator = new WeightCalculator();
        System.out.println(weightCalculator.calculateWeightInKilograms(10));

        AdapterInterface adapter = new Adapter();
        System.out.println(adapter.calculateWeightInPounds(10));
    }
}
