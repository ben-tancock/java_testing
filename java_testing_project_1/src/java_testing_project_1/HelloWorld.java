package java_testing_project_1;

public class HelloWorld {
	public static void printMethod1(int x) {
		for (int i = 0; i < x; i++) {
			for(int j = 0; j < x; j++) {
				if(j <= i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		printMethod1(5);
	}

}
