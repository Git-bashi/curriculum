package check;

import constants.Constants;

public class Check {
	private static String firstName = "石橋";
	private static String lastName = "亮典";

	private void printName(String firstName, String lastName) {
		System.out.println("printNameメソッド → " +  firstName + lastName);
	}

	public static void main(String[] args) {

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		Check check = new Check();

		check.printName(firstName, lastName);

		pet.introduce();

		rp.introduce();
	}
}
