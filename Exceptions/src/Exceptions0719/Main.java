package Exceptions0719;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

	public static void main(String[] args) {
		
//		CustomClass cc = new CustomClass();
//		
//		try {
//			cc.CustomMethod();
//		}
//		catch (CustomException e){
//			Throwable cause = e.getCause();
//			if (cause != null) {
//				System.out.println(cause.getCause());
//			}
//			else {
//				System.out.println("문제 없음");
//			}
//			
//		}
		
		BlockingQueue<Integer> boundedQueue = new ArrayBlockingQueue<>(5);

        try {
            // 큐에 요소 추가
            for (int i = 1; i <= 5; i++) {
                boundedQueue.add(i); // throws 예외
                System.out.println("Added element: " + i);
            }

            // 큐가 가득 찼으므로 다음 추가 시도는 실패함
            boolean wasAdded = boundedQueue.offer(6);
            // 6을 Integer class로 오토박싱
            if (!wasAdded) {
                System.out.println("Failed to add element: 6 (Queue is full)");
            }

            // 큐에서 요소 제거
            while (!boundedQueue.isEmpty()) {
            	// UnBoxing : Integer 클래스 값을 int로 변환해서 전달한다.
            	// FIFO의 First Out을 확인할 수 있다.
                int element = boundedQueue.poll();
                System.out.println("Removed element: " + element);
            }

        } catch (IllegalStateException e) {
            System.err.println("Error adding element to the queue: " + e.getMessage());
        }

	}

}
