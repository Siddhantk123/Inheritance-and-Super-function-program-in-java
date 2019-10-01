# Inheritance-and-Super-function-program-in-java
class Vehicle 	//parent class
{ 
	int maxSpeed = 120; 
} 
class Car extends Vehicle	//sub class 
{ 
	int maxSpeed = 180; 
	void display() 
	{ 
		System.out.println("Maximum Speed: " + super.maxSpeed); //use of super method
	} 
} 
class Test 
{ 
	public static void main(String args[]) 
	{ 
		Car small = new Car(); 
		small.display(); 
	} 
}
