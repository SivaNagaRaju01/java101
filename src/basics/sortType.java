package basics;

public class sortType<X extends Comparable<X>> {

    public void bubbleSort(X[] list) {
        int i,j;
        X temp;

        for(i=0; i<list.length-1; i++) {
            for(j=0; j<list.length-i-1; j++) {
                if(list[j].compareTo(list[j+1]) == 1) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
