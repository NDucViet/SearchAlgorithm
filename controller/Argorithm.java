package SearchAlgorithm.controller;

public class Argorithm {
    public void buddleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }


    public String linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return "your number at index " + i;
            }
        }
        return n + " not found in array";

    }

    public String binarySerach(int[] arr, int value, int left, int right) {
        if (left > right) {
            return value+" not found";
        }
        int mid = (left + right) / 2;
        if (arr[mid] == value) {
            return "your number at index " + mid;
        } else if (arr[mid] > value) {
            return binarySerach(arr, value, left, mid -1);
        } else{
            return binarySerach(arr, value, mid +1, right);
        }
    }
}
