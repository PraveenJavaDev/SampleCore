package sample.StringDemo;

public class StringBufferStringBuilder {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Canal");
		System.out.println(sb);
		sb.append("bign"); // Canalbign
		sb.append("gooc");
		System.out.println(sb);
		System.out.println(sb.reverse());
		

		
		
		
		StringBuilder sbu = new StringBuilder("pravee");
		sbu.append("Kumar");
		sbu.append(" kamshettigari");
		System.out.println(sbu);
		System.out.println(sbu.reverse());

	}

}
