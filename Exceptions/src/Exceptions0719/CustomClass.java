package Exceptions0719;

public class CustomClass {
	
	public void CustomMethod () throws CustomException {
		throw new CustomException("커스텀 예외 발생", null);
	}
}
