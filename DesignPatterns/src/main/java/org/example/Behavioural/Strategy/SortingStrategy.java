package org.example.Behavioural.Strategy;

public class SortingStrategy {

    Sorting sorting;

    SortingStrategy(Sorting sorting){
        this.sorting = sorting;
    }

    public void setSorting(Sorting sorting) {
        this.sorting = sorting;
    }

    public void sort(Object arr){
        sorting.sort(arr);
    }
}
