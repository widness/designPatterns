package lab.strategy.refactoring;

import lab.strategy.refactoring.BubbleSort;
import lab.strategy.refactoring.InsertSort;
import lab.strategy.refactoring.SelectionSort;

/**
 * Design patterns Lab 2 - Strategy
 */
public class Sorter {
    private BubbleSort bSort;
    private InsertSort iSort;
    private SelectionSort sSort;

    public Sorter() {
        bSort = new BubbleSort();
        iSort = new InsertSort();
        sSort = new SelectionSort();
    }

    public void sort(int[] vector, String sortmethod) {
        switch (sortmethod) {
            case "BubbleSort": this.bSort.doSort(vector);
                break;
            case "InsertSort": this.iSort.doSort(vector);
                break;
            case "SelectionSort": this.sSort.doSort(vector);
                break;
        }
    }

    public void showVectorData(int[] vector) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<vector.length; i++) {
            sb.append(vector[i] + "\t");
        }

        System.out.println(sb.toString());
    }
}
