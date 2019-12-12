
public class Day3 {

	public static void main(String[] args) {
		
		int a = 1000;
		int b = 8000;
		int c = 9200;
		
		
		if ((a>=b)&&(a>=c)) {
			System.out.println("a is greatest");
		}
		else {
			if ((b>a)&&(b>c)) {
				System.out.println("b is greatest");
			}
			else {
				if ((c>a)&&(c>b)) {
					System.out.println("c is greatest");
				}
					
			}
			
		}
	}
		}