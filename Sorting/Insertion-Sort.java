// Note:
// Stable sorting

// Technique:
// 2 pointers

// Big O:
// Time -> O(n^2)
// Space -> O(1) since it is swapping elements in-place

// Worst Case:
// Desc if Asc <--> Asc if Desc (too many swaps for each element)

// int[] arr = {2,4,6,1,3,5}

// for(int i = 1; i < arr.length; i++) {
// int j = i - 1;

// while(j >= 0 && arr[j+ 1] < arr[j]) {
// //swap
// int temp = arr[j + 1]; //getting curr element;
// arr[j+1] = arr[j]; //setting curr element to prev
// arr[j] = temp;//prev element is replaced with temp (prev curr)

// j--;//decrement
// }
// }

// --------------------------

// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
// public static void merge(int[] arr, int l, int m, int r) {

// // Find lengths of two subarrays to be merged
// int length1 = m - l + 1;
// int length2 = r - m;

// // Create temp arrays
// int L[] = new int[length1];
// int R[] = new int[length2];

// // Copy the sorted left & right halfs to temp arrays
// for (int i = 0; i < length1; i++) {
// L[i] = arr[l + i];
// }

// for (int j = 0; j < length2; j++) {
// R[j] = arr[m + 1 + j];
// }

// // initial indexes of left and right sub-arrays
// int i = 0; // index for left
// int j = 0; // index for right
// int k = l; // Initial index of merged subarray array

// // Merge the two sorted halfs into the original array
// while(i < length1 && j < length2) {
// if (L[i] <= R[j]) {
// arr[k] = L[i];
// i++;
// } else {
// arr[k] = R[j];
// j++;
// }
// k++;
// }
// // One of the halfs will have elements remaining

// // Copy remaining elements of L[] if any
// while (i < length1) {
// arr[k] = L[i];
// i++;
// k++;
// }

// // Copy remaining elements of R[] if any
// while (j < length2) {
// arr[k] = R[j];
// j++;
// k++;
// }
// }