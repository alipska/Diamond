import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ALipska on 2017-03-01.
 */
public class Diamond {

    public static final char INITIAL_LETTER = 'A';

    public List<String> print(char letter) {


        List<String> array = new ArrayList<String>();
        for(int i = 0; i< countLines(letter)/2+1; i++) {
            if(i==0) {
                array.add(drawFirstLine(letter));
            }else{
                array.add(drawSecondLine(letter,i+1));
            }
        }
        List<String> array2 = new ArrayList<String>();
        array2.addAll(array);
        Collections.reverse(array2);
        array2.remove(0);
        for(String a:array2){
            array.add(a);
        }

        return array;

    }

    private int countLines(char letter) {
        return 2*(letter-INITIAL_LETTER)+1;
    }

    private String drawSecondLine(char letter,int lineNumber) {

        int letterNumber = letter- INITIAL_LETTER;
        StringBuilder sb = new StringBuilder();
        outers(letter, sb, lineNumber);
        if(letter >INITIAL_LETTER){
            sb.append((char)(INITIAL_LETTER+lineNumber-1));
            for(int i = 0;i<(lineNumber-1)*2-1;i++) {
                sb.append("-");
            }
            sb.append((char)(INITIAL_LETTER+lineNumber-1));
        }
        outers(letter, sb, lineNumber);

        return sb.toString();
    }

    private String drawFirstLine(char letter) {
        StringBuilder sb = new StringBuilder();
        outers(letter, sb, 1);
        sb.append(INITIAL_LETTER);
        outers(letter, sb, 1);
        return sb.toString();
    }

    private void outers(char letter, StringBuilder sb, int lineNumber) {
        for (int i = 0; i < outersNumber(letter, lineNumber); i++) {
            sb.append('-');
        }
    }

    private int outersNumber(char letter, int lineNumber) {
        return letter -INITIAL_LETTER - (lineNumber-1);
    }
}
