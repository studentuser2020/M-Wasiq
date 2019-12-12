
public class MyFristClass {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 20;
		int c = 30;
		int d = 40;
		int e = 50;
		
		if ((a>b)&&(a<c)&&(a>d)&&(a>e)) {
			System.out.println("a is greatest");
		}
		else {
			if ((b>a)&&(b>c)&&(b>d)&&(b>e)) {
				System.out.println("b is greatest");
			}
			
			else {
				if ((c>a)&&(c>b)&&(c>d)&&(c>d)) {
					System.out.println("c is greatest");
				}
				else {
					if ((d>a)&&(d>b)&&(d>c)&&(d>e)) {
						System.out.println("d is greatest");
					}
				}
			}
		}
			}

}
