//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	   String word = args[0].toUpperCase();
           int timesToRepeat = Integer.parseInt(args[1]);
           String specialCase = "AEFHILMNORSX";
           for(int i = 0; i < word.length(); i++){
                char letter = word.charAt(i);
                String prefix;
                if(specialCase.indexOf(letter) != -1){
                        prefix = "an ";
                }else{
                        prefix = "a  ";
                }
                System.out.println("Give me " + prefix + letter + ": " + letter + "!");
           }
           System.out.println("What does that spell?");
           for(int i = 0; i < timesToRepeat; i++){
                System.out.println(word + "!!!");
           }


        }
}
