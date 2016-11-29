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
        int numberToSearch = 3;
        System.out.println(binarySearch(array, numberToSearch));
    }

    private static int binarySearch(int[] array, int n) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        
        if(n > array[high]){
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
