public class LetterPresence {
    public static void main(String[] args) {
        letterPresence("fffafvfevfev","fvdsfcd");
    }
    public static void letterPresence(String stringA,String stringB){

        for(int counterA=0;counterA<stringA.length();counterA++){
            for(int counterB=0;counterB<stringB.length();counterB++){
                if(stringA.charAt(counterA)==stringB.charAt(counterB)){
                    System.out.println("Character "+stringA.charAt(counterA)+" is present " +
                            "in both the strings");
                }
            }
        }
    }
}
