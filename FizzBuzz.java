
public class FizzBuzz {

	public static void main(String args[]) {

		for(int i = 1; i <= 100; i++){
			String fb = "";

			if(i % 3 ==  0){
				fb = "Fizz";
			}

			if(i % 5 == 0){
				fb += "Buzz";
			}

			if(fb.length() == 0) {
				fb += i;
			}

			System.out.println(fb);
		}
	}
}
