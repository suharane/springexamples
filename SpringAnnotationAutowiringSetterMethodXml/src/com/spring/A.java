package com.spring;

public class A {
	// reference of class B
		B b;
		
		


		public A() {

			System.out.println(" from  class A");

		}

		public B getB() {
			return b;
		}

		public void setB(B b) {
			this.b = b;
		}

	// this print method for class A and calling from show()  method

		void print() {

			System.out.println(" print() from A");
		}

	// this method is belog for class A

		public void show() {

			print(); 
			b.print();// this print method belogs to class B
		}

}
