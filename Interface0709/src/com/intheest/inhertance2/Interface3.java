package com.intheest.inhertance2;

public interface Interface3 {

	enum Interface3Enum {
		number1(10), number2(20), number3(30);

		private int Interface3int;
		
		Interface3Enum (int Interface3int) {
			this.Interface3int = Interface3int;
		}
		
		public int Interface3intCheck (int Interface3int2) {
			if (Interface3int > Interface3int2) {
				return Interface3int;
			}
			else {
				return Interface3int2;
			}
		}
	}
	
	abstract int Interface3Abstract(int Abstract3);
	
	default int Interface3Default(int Deafault3) {
		return Deafault3;
	}
	
	static int Interface3Static(int Static3) {
		return Static3;
	}
}
