package LeetCode.p1700;

import java.util.LinkedList;

public class Queue {
  public int countStudents(int[] students, int[] sandwiches) {
    int n = students.length;
    LinkedList<Integer> q = new LinkedList<>();
    for (int student : students) {
      q.offer(student);
    }

    int res = n;
    for (int sandwich : sandwiches) {
      int cnt = 0;
      while (cnt < n && q.peek() != sandwich) {
        q.offer(q.poll());
        cnt++;
      }
      if (q.peek() == sandwich) {
        q.poll();
        res--;
      } else {
        break;
      }
    }
    return res;
  }
}
