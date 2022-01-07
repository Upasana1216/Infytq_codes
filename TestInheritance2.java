package upasana;

class Animal{  
	void eat(){
		System.out.println("eating...");
	}  
}  
class Dogsz extends Animal{  
	void bark(){
		System.out.println("barking...");
	}  
}  
class BabyDog extends Dogsz{  
	void weep(){
		System.out.println("weeping...");
	}  
}  

class TestInheritance2{  
	
	public static void main(String args[]){  
		
		BabyDog d=new BabyDog();  
		d.weep();  
		d.bark();  
		d.eat();  
	}
}  
