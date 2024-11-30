package com.intheest.ihertance4;

public class PrimNumbersDemo {

	public static void main(String[] args) {
		
		PrimNumbers kmg = new PrimNumbers();
		Result kmg3 = new Result();

		kmg.setLimit(100); // 최대 소수의 범위는 어디까지?
		kmg.setRange(10, 50); // 출력할 소수의 범위는 어디까지?
		kmg.setPrimeNumArray(); // isPrime 배열을 초기화
		kmg.calculationPrimeNum(); // 소수를 계산
		kmg.printResult();
		
		kmg3.printResult();
		
		System.out.println("\n동작 횟수: " + PrimNumbers.getTotalRun());
	}
}
