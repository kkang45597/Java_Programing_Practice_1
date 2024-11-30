package com.intheeast.KMG;

import java.util.List;

public class LocalClass {

	static String regularExpression = "[^0-9]";
	  
    public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
      
//        final int numberLength = 10; // JDK 8 이전엔 이렇게만 사용해야 했다.
        
        List li;
       
         int numberLength = 10; // JDK 8 이후부턴 사용해도 된다.
         // 현재 numberLenght 실질적인 final 변수이다.
       
        class PhoneNumber {
            
            String formattedPhoneNumber = null;

            PhoneNumber(String phoneNumber){
//                 numberLength = 7; // 읽기 값으로 사용되므로 변경 금지
                String currentNumber = phoneNumber.replaceAll(
                  regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber() {
                return formattedPhoneNumber;
            }
            
            // 자바 8부터는 사용이 가능해졌다.
            public void printOriginalNumbers() {
                System.out.println("Original numbers are " + phoneNumber1 +
                    " and " + phoneNumber2);
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);
        
        // Valid in JDK 8 and later:

//        myNumber1.printOriginalNumbers();

        if (myNumber1.getNumber() == null) 
            System.out.println("First number is invalid");
        else
            System.out.println("First number is " + myNumber1.getNumber());
        if (myNumber2.getNumber() == null)
            System.out.println("Second number is invalid");
        else
            System.out.println("Second number is " + myNumber2.getNumber());

    }

    public static void main(String... args) {
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
