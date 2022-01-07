package upasana;

class Animalss{  
	void eat(){
		System.out.println("eating...");
	}  
}  

class Dogss extends Animalss{  
	void eat(){
		System.out.println("eating bread...");
	}  
	void bark(){
		System.out.println("barking...");
	}  
	void work(){  
		super.eat();  
		bark();  
	}  
}  
class TestSuper2{  
	public static void main(String args[]){  
		Dogss d=new Dogss();  
		d.work();  
	}
}  
