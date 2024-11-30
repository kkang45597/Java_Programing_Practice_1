package com.intheeast.world;

import com.intheeast.KMG.TopLevelPackage;

public class TopLevelPackageSubClass extends TopLevelPackage {

	public void accessHelloWorld() {
		this.helloWorld(); // TopLevelPackage 클래스의 protected 메서드를 사용한다.
	}
	
	public static void HelloWolrd() {
		
	}
}
