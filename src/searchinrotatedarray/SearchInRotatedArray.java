/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchinrotatedarray;

/**
 *
 * @author wilsoncastiblanco
 */
public class SearchInRotatedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array = new int[]{15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
        int[] array2 = new int[]{10, 15, 20, 0, 5};
        int[] array3 = new int[]{50, 5, 20, 30, 40};

        int numberToSearch = 5;
        System.out.println(binarySearch(array3, numberToSearch));
    }

    private static int binarySearch(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        int mid;

        int middle = (low + high) / 2;

        if (n == array[middle]) {
            return middle;
        } else if (n == array[high]) {
            return high;
        } else if (n == array[low]) {
            return low;
        }

        if (n > array[middle] && n < array[high]) {
            low = (low + high) / 2;
        } else if (n < array[middle] && n > array[low]) {
            low = 0;
        } else if (n < array[middle]) {
            high = (low + high) / 2;
        }

        while (low <= high) {
            mid = (low + high) / 2;
            if (array[mid] < n) {
                low = mid + 1;
            } else if (array[mid] > n) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}
