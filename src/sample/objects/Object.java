package sample.objects;

public class Object {

	
	int number=10;
	int num=20;
	void method1() {
		System.out.println("sample"+number);
	}
	
	
	  public static void main(String[] args) {
		  
		  Object obj=new Object(); 
		  obj.method1();
		  obj.method2();
		  
		  
		  
		  Object obj1=new Object();
		  obj1.method1();
		  Object obj2=new Object();
		  obj2.method1();
		  
	  
	  }
	  void method2() {
			System.out.println("sample in method 2");
		}
	 

}
