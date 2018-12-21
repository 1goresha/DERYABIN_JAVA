class Task01{
	public static void main(String[] args) {
		int currentSum = 15687;// текущая сумма
		
		
		System.out.println("5000 - " + currentSum / 5000);
		currentSum = currentSum % 5000;

		System.out.println("2000 - " +  currentSum / 2000);
		currentSum = currentSum % 2000;

		System.out.println("1000 - " +  currentSum / 1000);
		currentSum = currentSum % 1000;

		System.out.println("500 - " +  currentSum / 500);
		currentSum = currentSum % 500;

		System.out.println("200 - " +  currentSum / 200);
		currentSum = currentSum % 200;

		System.out.println("100 - " +  currentSum / 100);
		currentSum = currentSum % 100;

		System.out.println("50 - " +  currentSum / 50);
		currentSum = currentSum % 50;

		System.out.println("10 - " +  currentSum / 10);
		currentSum = currentSum % 10;			
	}
	
}