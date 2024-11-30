package NestedClasses;

public class OuterClass {

	String outerField = "Outer field";
    public static String staticOuterField = "Static outer field";

    // StaticNestedClass 객체 참조 변수
    StaticNestedClass staticNestedInstance;

    public OuterClass() {
        // StaticNestedClass 인스턴스를 생성하여 필드에 저장
        staticNestedInstance = new StaticNestedClass();
    }

    class InnerClass {
        void accessMembers() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        // 외부 클래스의 필드는 오직 외부 클래스 객체 참조를 통해서만 사용할 수 있습니다
        void accessMembers(OuterClass outer) {
            // Compiler error: Cannot make a static reference to the non-static
            // field outerField
            // System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }

    // StaticNestedClass의 메서드를 호출하는 메서드
    public void callStaticNestedMethod() {
        staticNestedInstance.accessMembers(this);
    }

    public static void main(String[] args) {
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();        
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nStatic nested class accessed from OuterClass:");
        System.out.println("---------------------------------------------");
        outerObject.callStaticNestedMethod();

        System.out.println("\nTop-level class:");
        System.out.println("----------------");
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);                
    }
}
