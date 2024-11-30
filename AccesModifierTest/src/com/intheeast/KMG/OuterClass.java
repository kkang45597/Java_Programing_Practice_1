package com.intheeast.KMG;

public class OuterClass {
    public void myMethod() {
        int number = 10; // final 또는 사실상 final이 아님

        // 익명 클래스 선언
        Runnable runnable = new Runnable() { // 자바에서 지원해주는 인터페이스이다.
            @Override // 생략해도 상관은 없다.
            public void run() {
                // number 변수에 접근하려고 하면 컴파일 오류 발생
                System.out.println(number);
            }
        };
        runnable.run();
        
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.myMethod();
//      myMethod(); // static에서 호출할땐 static만 호출이 가능하다.
    }
    
    // 추상화는 표준화에 가깝다.
}