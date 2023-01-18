package com.test;


public class KYCUser extends User{
	private double rewardPoints;
	
    public KYCUser(int userId, String userName, String email, double walletBalance, double rewardPoints) {
       super(userId, userName, email, walletBalance);
       this.rewardPoints = rewardPoints;
   }
       @Override
       public boolean makePayment(double billAmount) {
           boolean paymentSuccessful = super.makePayment(billAmount);
           if (paymentSuccessful) {
               rewardPoints += billAmount * 0.1;
               System.out.println("Added " + (billAmount * 0.1) + " reward points.");
           }
           return paymentSuccessful;
       }

       public double getRewardPoints() {
           return rewardPoints;
       }
}