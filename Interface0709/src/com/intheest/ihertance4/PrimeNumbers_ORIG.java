package com.intheest.ihertance4;

public class PrimeNumbers_ORIG {
	
	// 인스턴스 필드 : 기본적인 getter, setter 가 있어야 한다. (데이터 캡슐화)
	// static 필드
	// 정의 가능한 모든 생성자 (컨스트럭터)
	// 인스턴스 메서드
	// static 메서드
	// PrimeNumbers 클래스 객체를 생성하고 사용하는 PrimNumbersDemo 클래스의 main static 메서드
	// 새로운 데이터 타입 : 클래스를 정의하라
	
	
    public static void main(String[] args) {
        int limit = 100;
        boolean[] isPrime = new boolean[limit + 1];
        
		int total_count = 0;

        
        // Initialize all numbers as prime
        for (int i = 2; i <= limit; i++) {
        	total_count++;
            isPrime[i] = true;
        }

        // Implement Sieve of Eratosthenes
        for (int factor = 2; factor * factor <= limit; factor++) {
//        	total_count++;
            if (isPrime[factor]) {
                for (int j = factor * factor; j <= limit; j += factor) {
//                	total_count++;
                    isPrime[j] = false;
                }
            }
        }
        
		System.out.print("\n반복문 횟수:  " + total_count);


        // Print all prime numbers
        System.out.println("\nPrime numbers between 1 and 100:");
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
