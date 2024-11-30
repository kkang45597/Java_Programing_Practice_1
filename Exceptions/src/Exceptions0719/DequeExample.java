package Exceptions0719;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DequeExample {

    public static void main(String[] args) {
        // Deque 인스턴스 생성
        Deque<String> deque = new ArrayDeque<>();

        // Insert
        deque.addFirst("A"); // Deque: A
        deque.addLast("B");  // Deque: A, B
        deque.offerFirst("C"); // Deque: C, A, B
        deque.offerLast("D");  // Deque: C, A, B, D

        System.out.println("Deque after insertions: " + deque);

        // Remove
        System.out.println("Removed with removeFirst(): " + deque.removeFirst()); // C
        System.out.println("Removed with removeLast(): " + deque.removeLast());   // D
        System.out.println("Removed with pollFirst(): " + deque.pollFirst());     // A
        System.out.println("Removed with pollLast(): " + deque.pollLast());       // B

        // Deque is now empty
        System.out.println("Deque after removals: " + deque);

        // Retrieve
        try {
            System.out.println("Retrieved with getFirst(): " + deque.getFirst());
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            System.out.println("Retrieved with getLast(): " + deque.getLast());
        } catch (NoSuchElementException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Retrieved with peekFirst(): " + deque.peekFirst()); // null
        System.out.println("Retrieved with peekLast(): " + deque.peekLast());   // null

        // 다시 엘리먼트 추가
        deque.offerFirst("E"); // Deque: E
        deque.offerLast("F");  // Deque: E, F

        System.out.println("Deque after re-adding elements: " + deque);

        // 엘리먼트 조회
        System.out.println("Retrieved with getFirst(): " + deque.getFirst()); // E
        System.out.println("Retrieved with getLast(): " + deque.getLast());   // F
        System.out.println("Retrieved with peekFirst(): " + deque.peekFirst()); // E
        System.out.println("Retrieved with peekLast(): " + deque.peekLast());   // F
    }
}