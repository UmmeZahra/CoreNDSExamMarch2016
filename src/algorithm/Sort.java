package algorithm;

import java.util.Arrays;

public class Sort {
    private int[] array;
    private int[] tempMergArr;
    private int length;

    private static int[] a;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;

    long executionTime = 0;

	/*
	 * Please implement all the sorting algorithm. Feel free to add helping methods.
	 */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //-----------------------------------------------------------------------
    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int temp = 0;
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //----------------------------------------------------------------------------
    public int[] bubbleSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        for (int i = list.length; i >= 0; i--) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    //----------------------------------------------------------
    public void mergeSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        Sort mms = new Sort();
        mms.sort(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        //return list;
    }

    public void sort1(int list[]) {
        this.array = list;
        this.length = list.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex) {

        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            doMergeSort(lowerIndex, middle);
            doMergeSort(middle + 1, higherIndex);
            mergeParts(lowerIndex, middle, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i, j, k;
        i = lowerIndex;
        j = middle + 1;
        k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }

    }

    //---------------------------------------------------
    public int[] quickSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int low = 0;
        int high = list.length - 1;

        quickSort(list, low, high);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0)
            return;

        if (low >= high)
            return;

        // pick the pivot
        int middle = low + (high - low) / 2;
        int pivot = arr[middle];

        // make left < pivot and right > pivot
        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // recursively sort two sub parts
        if (low < j)
            quickSort(arr, low, j);

        if (high > i)
            quickSort(arr, i, high);
    }

    //-----------------------------------------------------
    public int [] heapSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here
        Arrays.toString(list);
        sort(list);
        Arrays.toString(list);
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static void buildheap(int []a) {
        n = a.length-1;
        for(int i=n/2; i>=0; i--){
            maxheap(a,i);
        }
    }

    public static void maxheap(int[] a, int i) {
        left = 2*i;
        right = 2*i+1;

        if(left <= n && a[left] > a[i]){
            largest=left;
        } else {
            largest=i;
        }

        if(right <= n && a[right] > a[largest]) {
            largest=right;
        }
        if(largest!=i) {
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void sort(int[] myarray) {
        a = myarray;
        buildheap(a);
        for(int i=n; i>0; i--) {
            exchange(0, i);
            n=n-1;
            maxheap(a, 0);
        }
    }

    //-------------------------------------------
    public int [] bucketSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here

        Arrays.toString(list);
        sort(list);
        Arrays.toString(list);

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }
    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }}
    //-----------------------------------------------------------
   public int [] shellSort(int [] array){
       final long startTime = System.currentTimeMillis();
       int[] list = array;
        //implement here
       Arrays.toString(list);
       Arrays.toString(shellSort(a));

       final long endTime = System.currentTimeMillis();
       final long executionTime = endTime - startTime;
       this.executionTime = executionTime;
       return list;
    }
    public static int[] shellSort1(int[] array){
        int h = 1;
        while (h < array.length) h = 3*h + 1;
        while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++){
                for (int i = h+k; i < array.length; i+=h){
                    int key = array[i];
                    int j = i-h;
                    while (j>=0 && array[j] > key){
                        array[j+h] = array[j];
                        j-=h;
                    }
                    array[j+h] = key;
                }
            }
        }
        return array;
    }
    //----------------------------------------------------------
    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
