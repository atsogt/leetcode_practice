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
