package upasana;

class Animals{  
	String color="white"; 
	void printColor(){  
		System.out.println(color);//prints color of Dog class  
		//System.out.println(super.color);//prints color of Animal class  
	} 
}  
class Dogs extends Animals{  
	
	String color="black";  
	void printColor(){  
		//super.printColor();
		System.out.println(color);//prints color of Dog class  
		System.out.println(super.color);//prints color of Animal class  
	}  
}  
class TestSuper1{  
	public static void main(String args[]){  
		Animals d=new Dogs();  
		d.printColor();  
	}
}  
