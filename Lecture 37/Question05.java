package q11288;
public class EnumDemo {
	public static void main(String[] args) {
		System.out.println(printDirectionMessage(Direction.EAST));
		System.out.println(printDirectionMessage(Direction.WEST));
		System.out.println(printDirectionMessage(Direction.NORTH));
		System.out.println(printDirectionMessage(Direction.SOUTH));
	}
	public static String printDirectionMessage(Direction direction) {
		switch (direction) {
			case EAST:
				return "East stands for Light!";
			case WEST:
				return "West stands for Strength!";
			case NORTH:
				return "North stands for Silence!";
			case SOUTH:
				return "South stands for Love!";
		}
		return "Unknown direction. This case will never occur when we use enums.";
	}
}
enum Direction {
	EAST, WEST, NORTH, SOUTH;
}
