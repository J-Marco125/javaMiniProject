package emulator_ATM;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		int Balance = 0;
		int Deposit = 0;
		int Withdraw = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		System.out.println("\t      ATM MACHINE");
		System.out.println("________________________________________");
		System.out.println();
		int atempt = 3;
		while(atempt >= 1) {
			System.out.print("ENTER PIN: ");
			int pin = scanner.nextInt(); 
			if(pin == 1234) {
				int anotherTransaction = 1;
				while(anotherTransaction >= 0) {
					System.out.println("SELECT TRANSACTION");
					System.out.println();
					System.out.println("DEPOSIT  [1]");
					System.out.println("BALANCE  [2]");
					System.out.println("WITHDRAW [3]");
					System.out.println("EXIT     [4]");
					System.out.print(">");
					int transaction = scanner.nextInt();
										
					switch(transaction) {
					case 1:{
						System.out.println();
						System.out.print("AMOUNT DEPOSIT: ");
						Deposit = scanner.nextInt();
						
						System.out.println("YOUR DEPOSITED AMOUNT IS "+Deposit);
						System.out.println();
						break;
						
						}
						
			
					case 2:{
						Balance = Deposit + Balance;
						System.out.println("YOUR CURREN BALANCE IS: "+Balance);
						System.out.println();
						
						
						break;
					}
					case 3:{
						System.out.print("ENTER AMOUNT TO WITHDRAW: ");
						Withdraw = scanner.nextInt();
						
						
						System.out.println();
						System.out.println("YOU WITHDRAW A AMOUNT OF "+Withdraw);
						System.out.println();
						
						
						Balance = Balance - Withdraw;
						System.out.println("YOUR CURRENT BALANCE IS "+Balance);
						
						
						break;
					}
					case 4:{
						System.exit(transaction);
						
						
					}
					default:{
						System.out.println();
						System.out.println("INVALID INPUT");
						
						
						break;
					}
					}
					
					
				}
				
				break;
			}
			else if(atempt == 1){
				System.out.println("YOUR ACCOUNT IS BLOCKED");
				break;
			}
			else {
				atempt = atempt - 1;
				System.out.println("INVALID PIN YOU ONLY HAVE "+atempt+" ATTEMPT");
				
			}
			
		}
		

		
		
		

	}

}
