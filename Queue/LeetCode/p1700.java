package LeetCode;

public class p1700 {
  public int countStudents(int[] students, int[] sandwiches) {
    int[] a = { 0, 0 };

    for (int i = 0; i < students.length; i++) {
      // students = [1,1,0,0]
      // students = [1,1,1,0,0,1]
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
