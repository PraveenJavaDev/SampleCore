package sample.objects;

public class MethodeTypsinjava {
	int num = 4;

	// no agrument method
	public void noargMethod() {

	}

// args method  with parameters
	public void argsMethod(int n) {
		int cal=100*n;
		System.out.println("Inside the argsMethod : " + cal);

	}

	public int noargwithRetutype() {
		int cal=10*20;
		return cal;

	}

	public int argwithRetutype(int n) {
		int cal=n*n;
		float f=98.23f;
		return cal;

	}
	

	public static void main(String[] args) {

		MethodeTypsinjava obj = new MethodeTypsinjava();
		int n = obj.num;
		obj.argsMethod(70);

	}

}
