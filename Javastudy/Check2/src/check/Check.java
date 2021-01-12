package check;

public class Check {
	private static String firstName = "石橋";
	private static String lastName = "亮典";

	private void printName(String first, String last) {
		System.out.println("printNameメソッド → " +  first + last);
	}

	public static void main(String[] args) {

		Pet pet = new Pet("java吉", "hoge");
		RobotPet rp = new RobotPet("R2D2", "ルーク");
		Check check = new Check();

		check.printName(firstName, lastName);

		pet.introduce();

		rp.introduce();
	}
}
