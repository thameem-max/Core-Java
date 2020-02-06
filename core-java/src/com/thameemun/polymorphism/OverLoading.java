package com.thameemun.polymorphism;

/*
 *  Note : 
 *  1. Changing number of parameters 
 *  2. Changing Data Type
 *  3. But not by changing only return type
 */
public class OverLoading {

}

/*
 * By Changing return type Error : Compile time error, Due to ambiguity
 */
class ChangingReturnType {
//	 static double add(int a, int b) {
//		return 0.0; 
//	 }
//	 static int add(int a,int b) {
//		 return 0;
//	 }
}

/*
 * Type Promotion in Java
 * 
 */
class TypePromotion {
	 static int add(int a, double b) {
		return 0; 
	 }
	 static int add(double a,int b) {
		 return 0;
	 }
	static void testMethod() {
		//add(20,20); Compile time error based on passing values
		add(10,2.0); // No error as it is having clarity which method to call
	}
}
