package interface240705;

public interface OperateCar {

	   // 상수 선언, 있을 경우
	   // 메서드 서명
	   // RIGHT, LEFT 값을 가진 enum
	   int turn(Direction direction, double radius, double startSpeed, double endSpeed);
	   int changeLanes(Direction direction, double startSpeed, double endSpeed);
	   int signalTurn(Direction direction, boolean signalOn);
	   int getRadarFront(double distanceToCar, double speedOfCar);
	   int getRadarRear(double distanceToCar, double speedOfCar);
	
}
