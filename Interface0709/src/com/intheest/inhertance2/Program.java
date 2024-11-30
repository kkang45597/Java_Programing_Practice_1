package com.intheest.inhertance2;

public class Program implements GroupedInterface {

	@Override
	public String Interface1Abstract(String Abstract1) {
		return "Interfac1의 Abstract 메서드 " + Abstract1;
	}

	@Override
	public boolean Interface2Abstract(boolean Abstract2) {
		return true;
	}

	@Override
	public int Interface3Abstract(int Abstract3) {
		return Abstract3;
	}

	@Override
	public String GroupedInterfaceMethod(String Abstaract4) {
		return "GroupedInterface call " + Abstaract4;
	}
	
	public static void main(String[] args) {
		
		Program call = new Program();
		Interface1Enum enum1 = Interface1Enum.String1;
		Interface2Enum enum2 = Interface2Enum.yes;
		Interface3Enum enum3 = Interface3Enum.number1;
		
		System.out.println(enum1.getInterface1strKR() + ", " + enum1.getInterface1strENG());
		System.out.println(call.Interface1Abstract("A"));
		System.out.println(call.Interface1Default("B"));
		System.out.println(Interface1.Interface1Static("C"));
		
		///
		System.out.println("");
		System.out.println(enum2.getInterface2str() + ", " + enum2.getInterface2b() 
		+ ", " + enum2.getInterface2int());
		
		enum2.setInterface2str("no");
		enum2.setInterface2b(false);
		enum2.setInterface2int(-1);
		
		System.out.println(enum2.getInterface2str() + ", " + enum2.getInterface2b() 
		+ ", " + enum2.getInterface2int());
		System.out.println(call.Interface2Abstract(false));
		System.out.println(call.Interface2Default(false));
		System.out.println(Interface2.Interface2Static(false));
		
		
		///
		System.out.println("");
		System.out.println(enum3.Interface3intCheck(20));
		System.out.println(call.Interface3Abstract(45));
		System.out.println(call.Interface3Default(97));
		System.out.println(Interface3.Interface3Static(369));
		
		System.out.println("");
		System.out.println(call.GroupedInterfaceMethod("Hello World"));
	}
}
