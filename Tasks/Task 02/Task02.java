import java.util.Random;

class Task02 {
	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt(255);
		int b;

		b = a % 2;
		System.out.println(b+"   A");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"  / \\");	
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		b = a % 2;
		System.out.println(b+"   |");
		a = a / 2;

		
	}
}