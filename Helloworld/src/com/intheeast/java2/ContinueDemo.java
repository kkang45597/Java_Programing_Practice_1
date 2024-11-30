package com.intheeast.java2;

public class ContinueDemo {

	public static void main(String[] args) {
		
		String x = "peter piper picked a ";
		String y = "peck of pickled peppers";
		String z = x + y;
		
		String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            char temp = searchMe.charAt(i);
            if(temp != 'p') {
//        	if (searchMe.charAt(i) != 'p') {
                continue;
            }
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");

	}

}
