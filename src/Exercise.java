
public class Exercise {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 30;
		int d = 400;
		int e = 500;
		
		if ((a>b)&&(a<c)){
			System.out.println("a is greatest"+a);
		}
		
		if ((a>d)&&(a>e)){
				System.out.println("a is greatest"+a);
			}
			
		if ((b>a)&&(b>c)){
					System.out.println("b is greatest"+b);
				}
		if ((b>d)&&(b>e)){
						System.out.println("b is greatest"+b);
					}
		if ((c>a)&&(c>b)){
					System.out.println("c is greatest"+c);
		}
					
		if ((c>d)&&(c>e)) {
			System.out.println("c is greates");
		}
					
		if ((d>a)&&(d>b)){
			System.out.println("d is greatest");
		}
		if ((d>c)&&(d>e)){
			System.out.println("d is greatest");
		}
	}
}