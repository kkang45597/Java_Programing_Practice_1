package com.intheeast.java2;

public class ContinueWithLabelDemo {

	private int count;
	
	private void getCount() {
		
	}
	
	public int inclementCount() {
		return ++count;
	}
	
	public static void main(String[] args) {

		 String searchMe = "Look for a substring in me";
	        String substring = "sub";
	        boolean foundIt = false;
	        
	        ContinueWithLabelDemo cwld = new ContinueWithLabelDemo();
	        for(int i = 0; i < 5; i++) {
	        	int ret = cwld.inclementCount();
	        	System.out.printf("Looping count:%d, count value:%d \n", i, ret);
	        }
	        
	        int max = searchMe.length() - 
	                  substring.length();

//	    test:
//	        for (int i = 0; i <= max; i++) {
//	            int n = substring.length();
//	            int j = i;
//	            int k = 0;
//	            while (n-- != 0) {
//	                if (searchMe.charAt(j++) != substring.charAt(k++)) {
//	                    continue test;
//	                }
//	            }
//	            foundIt = true;
//	            break test;
//	        }
//	        System.out.println(foundIt ? "Found it" : "Didn't find it");
	        
	        return;
	}

}
