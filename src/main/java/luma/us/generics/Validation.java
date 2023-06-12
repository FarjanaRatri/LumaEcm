package luma.us.generics;

import org.testng.Assert;

public class Validation {
	
	// Validation
		public static void getVerification(String Expected, String Actual) {// void method
			Assert.assertEquals(Expected, Actual);// is it 1st one always expected then actual?
			
			if(Expected.equals(Actual)) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println("Both are not equal");
			}
		}// or
		public static boolean getVerifyTheResult(String actual, String expected) {// return method boolean
			Assert.assertEquals(actual, expected);
			if(actual.equals(expected)) {
				System.out.println("actual and expected are same");
			}else {
				System.out.println("actual and expected are not same");
			}
			return false;// return either true or false
			
		}

}
