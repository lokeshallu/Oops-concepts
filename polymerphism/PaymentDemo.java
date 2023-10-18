package com.kn.polymerphism;

public class PaymentDemo {

	public static void main(String[] args) {
		Payment p;
		System.out.println("------UPI------");
		p = new Upi();
		p.bill();
		p.offer();
		p.pay();
		System.out.println();
 
		p = new Wallet();
		System.out.println("----WALLET-------");
		p.bill();
		p.offer();
		p.pay();
		System.out.println();

		p = new Card();
//      card c = new card();  // earlier we write this in inheritance
		System.out.println("------Card-------");
		p.bill();
		p.offer();
		p.pay();
		System.out.println();
		
		
		
		
	}

}
