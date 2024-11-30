package com.intheest.inhertance2;

public interface Interface1 {

	enum Interface1Enum {
		String1("스트링 1", "string1"), 
		String2("스트링 2", "string2"), 
		String3("스트링 3", "string3");

		private String Interface1strKR;
		private String Interface1strENG;

		Interface1Enum(String Interface1strKR, String Interface1strENG) {
			this.Interface1strKR = Interface1strKR;
			this.Interface1strENG = Interface1strENG;
		}

		public String getInterface1strKR() {
			return Interface1strKR;
		}
		public String getInterface1strENG() {
			return Interface1strENG;
		}
	}
	
	abstract String Interface1Abstract(String Abstaract1);
	
	default String Interface1Default(String Default1) {
		return "Interfac1의 Default 메서드 " + Default1;
	}
	
	static String Interface1Static(String Static1) {
		return "Interfac1의 Static 메서드 " + Static1;
	}
}
