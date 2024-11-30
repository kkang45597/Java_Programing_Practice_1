package com.intheeast.KMG;

public class HelloWorldAnonymousClasses {
	
	interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }

    public void sayHello() {
        
        class EnglishGreeting implements HelloWorld { // 지역 클래스 선언
            
//        	EnglishGreeting xxx = new EnglishGreeting(); // 사용하지 않는 것이 좋다.
//        	HelloWorld yyy = new EnglishGreeting(); // 인터페이스명을 사용해도 된다! 왠만하면 다 이거 쓴다.
        	// 인터페이스 추상화(느슨한 결합)를 위하여 쓴다.
        	
        	String name = "world";
            public void greet() {
                greetSomeone("world");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
      
        HelloWorld englishGreeting = new EnglishGreeting();
        
        HelloWorld frenchGreeting = new HelloWorld() { // 익명 클래스 선언
        	// 선언과 동시에 인스턴스(구현)한다. 구체화한다.
            String name = "tout le monde";
            public void greet() {
                greetSomeone("tout le monde");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Salut " + name);
            }
        };
        
        // HelloWorld 인터페이스를 구현한(구체)를 가지는 참조 변수
        HelloWorld spanishGreeting = new HelloWorld() { // 익명 클래스 선언	
            String name = "mundo";
            public void greet() {
                greetSomeone("mundo");
            }
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola, " + name);
            }
        };

        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }

    public static void main(String... args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    } 
}
