package nl.hva.miw.ads.quicksort;

import java.util.Arrays;

public class InsertionSort {
  /** The method for sorting the numbers */
  public static void insertionSort(int[] list) {
    insertionSort( list, 0, list.length - 1);
  }

  /**
   * A egneric InsertionSort that sorts elements inside a bigger array.
   * This mehtod will only sort (in-place) the elements in the list starting from index first up to and including last.
   *
   * We added this method to allow it to be used in QuickSort. --- Michel
   *
   * @param list
   * @param first
   * @param last
   */
  public static void insertionSort(int[] list, int first, int last ) {
    for (int i = first; i <= last; i++) {
      /** insert list[i] into a sorted sublist list[first..i-1] so that
       list[first..i] is sorted. */
      int currentElement = list[i];
      int k;
      for (k = i - 1; k >= first && list[k] > currentElement; k--) {
        list[k + 1] = list[k];
      }

      // Insert the current element into list[k+1]
      list[k + 1] = currentElement;
    }
  }

}
