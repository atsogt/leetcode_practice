public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        //removes first element from queue
        queue.remove();

        for (Integer i : queue) {
            System.out.println(i);
        }
    }
}