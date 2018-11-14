package homework;

public class hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double itemPrice = 20.53;
		int moneyInWallet = 30;
		double MoneyLeft = moneyInWallet - itemPrice;
		int numberOfFriends = 80;
		int myAge = 20;
		int friendsEachYear = numberOfFriends/myAge;
		String firstName = "Craig";
		String lastName = "Brazelton";
		char middleInitial = 'W';
		String fullName = firstName + " " + middleInitial + " " + lastName;
		
		System.out.println("after purchase:" + MoneyLeft);
		System.out.println("Average friends gained in a year:" + friendsEachYear);
		System.out.println("my name is:" + fullName);
		
	}

}
