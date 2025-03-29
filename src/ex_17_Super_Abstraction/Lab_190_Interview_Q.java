package ex_17_Super_Abstraction;

public class Lab_190_Interview_Q {

}

interface I11{}
interface I12{}
class A1{}
class B1{}
// class Test1 extends A1,B1{}  multiple inheritance in class is not possible
class Test2 extends A1{}
class Test3 implements I11{}
class Test4 implements I11,I12{}

class Test5 extends A1 implements I11,I12{} // possible
// class Test6 implements I11,I12 extends B1{} // not possible