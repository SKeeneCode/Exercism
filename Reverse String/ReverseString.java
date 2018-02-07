class ReverseString {

    String reverse(String inputString) {
        String reverseInput = "";
        for (int i = inputString.length(); i > 0 ; i--){
            Character letter = inputString.charAt(i-1);
            reverseInput+=letter.toString();
        }
        return reverseInput;
    }
  
}