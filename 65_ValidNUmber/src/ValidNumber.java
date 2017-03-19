/**
 * Created by liubin on 3/19/17.
 */
public class ValidNumber {
    public static boolean  isNumber(String s){
        return s.matches("(\\s*)[+-]?((\\.[0-9]+)|([0-9]+(\\.[0-9]*)?))(e[+-]?[0-9]+)?(\\s*)");
    }

    public static void main(String args[]){
    }
}
