package LeetCode.p1700;

public class p1700 {
  public int countStudents(int[] students, int[] sandwiches) {
    // array with two elements keeping count of students base on 0's and 1's
    int[] a = { 0, 0 };
    // this iteration is similar to bucket sorting
    for (int i = 0; i < students.length; i++) {
      // ex input:students = [1,1,0,0]
      // ex2 input:students = [1,1,1,0,0,1]
      a[students[i]]++;
    }

    int k = 0;
    // sandwiches = [0,1,0,1]
    // sandwiches = [1,0,0,0,1,1]
    while (k < sandwiches.length) {
      if (a[sandwiches[k]] > 0) {
        a[sandwiches[k]] -= 1;
      } else {
        break;
      }
      k++;
    }
    return sandwiches.length - k;
  }
}
