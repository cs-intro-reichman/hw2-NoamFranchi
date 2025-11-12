//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String word = args[0];
           int timesToRepeat = Integer.parseInt(args[1]);
           String specialCase = "AEFHILMNORSX";
           for(int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                String prefix;
                if(specialCase.charAt(letter) != -1){
                        prefix = "an";
                }else{
                        prefix = "a ";
                }
                System.out.println("Give me " + letter + ": " + letter + " ! ! !");
           }

        }
}
