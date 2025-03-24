package org.example.Behavioural.Strategy;

public class Main {
    public static void main(String[] args) {
        SortingStrategy sortingStrategy = new SortingStrategy(new QuickSort());
        sortingStrategy.sort(new int[]{1, 2, 3, 4, 5});
        sortingStrategy.setSorting(new BubbleSort());
        sortingStrategy.sort(new int[]{1, 2, 3, 4, 5});
    }
}
