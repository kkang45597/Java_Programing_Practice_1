package com.intheest.ihertance4;

public class PrimNumbers {
	
	int limit = 0;
	static int total_run = 0;
	boolean[] isPrime = null;
	
	int min = 0;
	int max = 0;
	
	// 소수를 범위를 설정할 숫자를 받아옵니다.
	public void setLimit(int limit) {
		this.limit = limit;
	}
	
	// min 과 max 값 사이의 범위를 지정합니다.
	public void setRange(int min, int max) { 
		this.min = min;
		this.max = max;
	}
	
	// 반복문이 동작한 횟수를 반환합니다.
	public static int getTotalRun() {
		return total_run;
	}
	
	// isPrime 배열에 숫자를 채워 넣습니다.
	public void setPrimeNumArray() {
		this.isPrime = new boolean[limit + 1];
		for(int i = 2; i <= limit; i++) {
			this.isPrime[i] = true;
			total_run++;
		}
	}
	
	// isPrime 배열에서 소수를 찾아서 값을 false 로 변환합니다.
	public void calculationPrimeNum() {
		for (int factor = 2; factor * factor <= limit; factor++) {
			if (this.isPrime[factor]) {
                for (int j = factor * factor; j <= limit; j += factor) {
                    this.isPrime[j] = false;
                    total_run++;
                }
            }
			total_run++;
		}
	}
	
	// 결과 값을 출력합니다.
	public void printResult() {
		for (int i = min; i <= max; i++) {
			if (this.isPrime[i]) {
				System.out.print(i + " ");
			}
		}
	}
}
