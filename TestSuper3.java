package upasana;

class Animalz{  
	Animalz(){
		System.out.println("animal is created");
	}  
}  
class Dogz extends Animalz{  
	Dogz(){  
		super();  
		System.out.println("dog is created");  
	}  
}  
class TestSuper3{  
	public static void main(String args[]){  
	Dogz d=new Dogz();  
}}  
