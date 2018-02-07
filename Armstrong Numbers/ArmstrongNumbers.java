class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {
		String numString = Integer.toString(numberToCheck);
		int number = 0;
		for(int i = 0; i < numString.length(); i++){
			int digit = numString.charAt(i)-'0';
			number += Math.pow(digit,numString.length());
		}
		return (number == numberToCheck);
	}

}
