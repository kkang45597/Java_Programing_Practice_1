package interface240705;

public class OperateBMW760i implements OperateCar {

	public int turn(Direction direction, double radius, double startSpeed, double endSpeed) {
		
		int ret = 0;
		switch(direction) {
		case LEFT:
			ret = Direction.LEFT.getDirectionValue();
			break;
		case RIGHT:
			ret = Direction.RIGHT.getDirectionValue();
			break;
		case FOWARD:
			ret = Direction.FOWARD.getDirectionValue();
			break;
		case BACKWARD:
			ret = Direction.BACKWARD.getDirectionValue();
			break;
		default:
			break;
		}
		return 0;
	}

	public int changeLanes(Direction direction, double startSpeed, double endSpeed) {
		return 0;
	}

	public int signalTurn(Direction direction, boolean signalOn) {
		return 0;
	}

	public int getRadarFront(double distanceToCar, double speedOfCar) {
		return 0;
	}

	public int getRadarRear(double distanceToCar, double speedOfCar) {
		return 0;
	}

}
