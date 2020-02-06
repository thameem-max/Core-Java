package com.thameemun.inheritance;

public class MultipleInheritance {

}

class A {

}

class B {

}
/*
 * Note : Multilevel Inheritance is not supported in java, Due to ambugity, Due
 * to same method will be present in both the classes there will be ambiguity,
 * Compile time errors are better than Run Time by default it will throw error
 * Error : Compile Time Error 
 * Solution : Can be achieved through interface
 */
//class C extends A,B {
//	
//}

interface D {

}

interface E {

}

class F implements D, E {

}
