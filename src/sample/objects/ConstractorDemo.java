package sample.objects;

public class ConstractorDemo {
	int num;
	String name;

	ConstractorDemo() {

	}

	ConstractorDemo(int num) {
		this.num = num;
	}

	ConstractorDemo(int num, String name) {
		this.num = num;
		this.name = name;

	}

	public static void main(String[] args) {
		ConstractorDemo demo = new ConstractorDemo();
		demo.num = 10;
		demo.name = "ramesh";
		ConstractorDemo demo2 = new ConstractorDemo(13);
		
		
		ConstractorDemo demo1 = new ConstractorDemo(12, "name");

	}

}
