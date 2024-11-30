package com.intheest.ihertance4;

public class CountNumber {

	public static void main(String[] args) {
		
		int count = 0;
		int total_count = 0;
		
//		for(int x = 2; x <= 100; x++ ) {
//			if( x % 2 != 0 || x == 2) {
//				if( x % 3 != 0 || x == 3) {
//					if( x % 5 != 0 || x == 5) {
//						if ( x % 7 != 0 || x == 7) {
//							System.out.print(x + ", ");
//							count++;
//						}
//					}
//				}
//			}
//		}
		
		for(int x = 1; x <= 100; x++ ) {
			
			int z = 0;
			
		// [(x 를 2로 나누엇을때 나머지가 0이 아니면) 혹은 (x 가 2이면)] 그리고 x 가 1이 아니면 true 반환
			if(((x % 2 != 0) || (x == 2)) && (x != 1)) {
				for(int y = 3; y <=7; y +=2 ) {
					total_count++;
		
		// (x 를 y 로 나누엇을때 나머지가 0이면) 그리고 (x 와 y 가 동일하지 않으면) true 반환
					if((x % y == 0) && (x != y)) {
						break;
					}
					if(y == 7) {
						System.out.print(x + " ");
						count++;
					}
					
		// (x 를 y 로 나누엇을때 나머지가 0이 아니면) 그리고 (x 와 y 가 동일하면) true 반환
//					if((x % y != 0) || (x == y)) {
//						z++;
//					}
				}
//				if(z == 3) {
//					System.out.print(x + " ");
//					count++;
//				}
			}
		}
		
		System.out.print("\n소수의 갯수:  " + count);
		System.out.print("\n반복문 횟수:  " + total_count);
	}
}


