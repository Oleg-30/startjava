public class ConditionalStatement {
	
	public static void main(String[] args) {
		int myYearsold = 37;
		if(myYearsold>20){
			System.out.println("I'm more 20 years old");
		}
		int myGenderMale = 2;
		boolean isEvenNumber = myGenderMale == 2;
		if(isEvenNumber == true) {
			System.out.println("I'm male");
		}
		if(isEvenNumber == false) {
			System.out.println("I'm not male");
		}
		float myHeight = 1.7f;
		if(myHeight<1.80) {
			System.out.println("My heigt is less than 1,80");
		} else {
			System.out.println("My heigt isn't less than 1,80");
		}
		char firstLatterOfMyName = 'O';
		if (firstLatterOfMyName == 'M') {
			System.out.println("My name begins with the letter 'M");
		} else if (firstLatterOfMyName == 'N') {
			System.out.println("My name begins with the letter 'N");
		} else {
			System.out.println("My name does not begins in M or N");
		}
	}
}

	
	