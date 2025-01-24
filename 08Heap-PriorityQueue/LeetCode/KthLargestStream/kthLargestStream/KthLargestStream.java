package KthLargestStream.kthLargestStream;
// Design a class to find the kth largest integer in a stream of values, including duplicates. E.g. the 2nd largest from [1, 2, 3, 3] is 3. The stream is not necessarily sorted.

// Implement the following methods:

// constructor(int k, int[] nums) Initializes the object given an integer k and the stream of integers nums.
// int add(int val) Adds the integer val to the stream and returns the kth largest integer in the stream.
// Example 1:

// Input:
// ["KthLargest", [3, [1, 2, 3, 3]], "add", [3], "add", [5], "add", [6], "add", [7], "add", [8]]

// Output:
// [null, 3, 3, 3, 5, 6]

// Explanation:
// KthLargest kthLargest = new KthLargest(3, [1, 2, 3, 3]);
// kthLargest.add(3);   // return 3
// kthLargest.add(5);   // return 3
// kthLargest.add(6);   // return 3
// kthLargest.add(7);   // return 5
// kthLargest.add(8);   // return 6

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthLargestStream {
  class KthLargest {
    List<Integer> arr;
    int K;

    public KthLargest(int k, int[] nums) {
      K = k;
      arr = new ArrayList();
      for (int i = 0; i < nums.length; i++) {
        arr.add(nums[i]);
      }
    }

    public int add(int val) {
      arr.add(val);
      Collections.sort(arr);
      return arr.get(arr.size() - K);
    }
  }

}
