package com.test;

public class Test {

	public static void main(String[] args) {
		User user1 = new User(101,"John","john@gmail.com",5000);
        Wallet.processPaymentByUser(user1, 100);



        KYCUser user2 = new KYCUser(102,"Tom","tom@gmail.com",2000,100);
        Wallet.processPaymentByUser(user2, 200);
    }

}


