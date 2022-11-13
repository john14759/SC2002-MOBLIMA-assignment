package uI;

import java.util.Scanner;

/**
 * Inherited from PaymentMethod.
 * Allows the user to pay by QR code.
 * @author Group 4 SS9
 * @version 1.0
 * @since 2022-11-07
 */

public class PayByQRCode extends PaymentMethod{
	public PayByQRCode(double price) {
		super(price);
	}
	
	/**
	 *Asks user to scan QR code.
	 *Credentials for the card are also checked.
	 */
	
	public boolean promptInput(Scanner sc) {
		System.out.println("Total Price: "+super.price);
		System.out.print("Please Scan Below QRCode for Payment\n");
		System.out.print(""+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||     |||||||||     |||||||||||||||||\n"+
			"|||||  ||||||  |||||||  ||||  ||||||||||||||\n"+
			"|||||  ||||||  |||||||  ||||  ||||||||||||||\n"+
			"|||||  ||||||  |||||||  ||||  ||||||||||||||\n"+
			"|||||  ||||||  |||||||  |  |||||||||||||||||\n"+
			"|||||  ||||    |||||||  |||  |||||||||||||||\n"+
			"||||||||     ||  |||||  |||||  |||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"+
			"||||||||||||||||||||||||||||||||||||||||||||\n"
		);
		System.out.print("Please enter any number to continue: ");
		int buffer = sc.nextInt();
		sc.nextLine();
		OnSuccessPayment();
		return true;
	}
	
	/**
	 * If payment is successful, inform user
	 */
	
	public void OnSuccessPayment() {
		System.out.println("Payment successful!");
		System.out.println("Receipt will be sent to you by email. Thank you!");
	}
}