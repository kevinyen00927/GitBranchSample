package gitsample3;

public class mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//這是測試第一版
		System.out.println("這是測試第一版");
		Math cMath = new Math();
		System.out.println();
		System.out.print(cMath.add(10,5));	
		
	}

	}


class Math{
	int add(int a ,int b) {
		return a+b;
	}
	
	
	
	
}
