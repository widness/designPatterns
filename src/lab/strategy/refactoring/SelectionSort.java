package lab.strategy.refactoring;

public class SelectionSort implements sortBehavior{
    @Override
    public void doSort(int[] vector) {
        int temp, cursor = 0;

        for (int i=0; i<vector.length; i++) {
            temp   = vector[i];
            cursor = i;

            for (int j=i; j<vector.length; j++) {
                if (vector[j] < temp) {
                    temp   = vector[j];
                    cursor = j;
                }
            }

            vector[cursor] = vector[i];
            vector[i]      = temp;
        }
    }
}
