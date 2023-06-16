package coreJava3;

public class AutoBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long long1 = 1232312312;
		int int1 = 12;
		float float1 = 14.34f;
		boolean boo = true;
		// Auto boxing
		Long longwrap = long1;
		Integer intWrap = int1;
		Float floatWrap = float1;
		Boolean booWrap = boo;
		System.out.println("Integer Autoboxing: " + intWrap);
		System.out.println("Float Autoboxing: " + floatWrap);
		System.out.println("Boolean Autoboxing: " + booWrap);
		//Auto unboxing
		long long2 = longwrap;
		int int2 = intWrap;
		float float2 = floatWrap;
		boolean boo1 = booWrap;
		
		System.out.println("Integer Unboxing: " + int2);
		System.out.println("Float Unboxing: " + float2);
		System.out.println("Boolean Unboxing: " + boo1);
	}

}
