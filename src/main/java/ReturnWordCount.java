
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        int result = 0;
        if (in.length()>0)
            result+=1;

        char test = ' ';    
        for (int i = 0; i < in.length()-1; i++){
            // if (in.substring(i,i+1) == " ")
            if (in.charAt(i)==test)
                result+=1;
        }    

        return result;
    }
}
