package upasana;

class Animalt{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dogt extends Animalt{  
	void bark(){
		System.out.println("barking...");
	}  
}  
class Cat extends Animalt{  
	void meow(){
		System.out.println("meowing...");
	}  
}  

class TestInheritance3{  
	public static void main(String args[]){  
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();
		//c.bark();//C.T.Error  
	}
} 

