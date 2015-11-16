import java.security.SecureRandom;

public class dreidel {
	private static char letters[] = { 'נ', 'ג', 'ה', 'ש' };

	public static void main(String[] args) {
		SecureRandom rng = new SecureRandom();
		System.out.println(letters[rng.nextInt(4)]);
	}
}
