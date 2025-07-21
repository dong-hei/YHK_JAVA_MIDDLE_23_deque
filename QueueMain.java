package collection.deque;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();

        //데이터 추가
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println(queue);

        //꺼내지 않고 단순 조회
        System.out.println("queue.peek() = " + queue.peek());

        //꺼내기 - FIFO (First In First Out)
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println("queue.poll() = " + queue.poll());
        System.out.println(queue);

    }
}
