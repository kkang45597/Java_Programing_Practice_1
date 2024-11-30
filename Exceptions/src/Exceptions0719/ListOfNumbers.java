package Exceptions0719;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ListOfNumbers {

    private List<Integer> list;
    private static final int SIZE = 10;   
    
    public ListOfNumbers () {
        list = new ArrayList<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++) {
            list.add(new Integer(i));
        }
    }

    public void writeList() {
	// The FileWriter constructor throws IOException, which must be caught.
        PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt")); // 파일명만 있는 상대 경로 (현재 프로젝트 Root 디렉터리에 있다)
		}
//		catch (IOException e) {
		catch (NullPointerException | IOException e) { // multi-catch 블록 : 하나의 catch 블록에 여러개의 예외를 처리하는 방법
			e.printStackTrace();
		}
		
		if(out == null) {
			throw new NullPointerException();
		}
		else {
			for (int i = 0; i < SIZE; i++) {
	            // The get(int) method throws IndexOutOfBoundsException, which must be caught.
	            out.println("Value at: " + i + " = " + list.get(i));
	        }
	        out.close();
		}
 
    }
}