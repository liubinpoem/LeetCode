/**
 * Created by liubin on 3/19/17.
 */
public class ValidNumber {
    public static boolean  isNumber(String s){
        boolean res=true;

        //input exception process
        if(s.isEmpty()||s.equals("")||s.equals(" "))
            return false;
        s=s.trim();
        char[] arr=s.toCharArray();
        //exception amid arrays
        int point=-1,elan=-1;
        for(int i=0;i<arr.length;i++) {
            //process point
            if (arr[i] == '.') {
                if(point==-1)
                    point=i;
                else
                    return false;
            }else {
                //process e
                if (arr[i] == 'e') {
                    if (elan == -1)
                        elan = i;
                    else
                        return false;
                } else {
                    if (arr[i] < '0' || arr[i] > '9')
                        return false;
                }
            }
        }

        //only contains point
        if(arr.length==1&&point==0)
            return false;
        //ends with point
        if(point==arr.length-1)
            return false;
        //point behind elan or next before it
        if(point>elan||point==elan-1)
            return false;
        if(elan==1||elan==arr.length-1&&arr.length>1)
            return false;

        return res;
    }

    public static void main(String args[]){
        String str=".1";
        System.out.println(str.length());
        System.out.println(ValidNumber.isNumber(str));
    }
}
