package InterviewPrep;
// Given a string return the version without the first two chars,
//keep first char if a and keep second if it is b
public class StringBuilder {
    public static void main(String[] args) {
        String str = "abicim";
        String str2 = "nurbetul";
        String str3 = "ahmet";
        String str4 = "as";

        System.out.println(deFront(str));
        System.out.println(deFront(str2));
        System.out.println(deFront(str3));
        System.out.println(deFront(str4));


    }
    public static String deFront(String str){
        java.lang.StringBuilder strBuild = new java.lang.StringBuilder(str.length());
        if(str.length()>=2){
            if(str.charAt(0)=='a'){
                strBuild.append('a');
            }
            if(str.charAt(1)=='b'){
                strBuild.append('b');
            }
            strBuild.append(str.substring(2));
            return strBuild.toString();
        }
        else if(str.length()==1 && str.charAt(0)=='a'){
            return "a";
        }
        else
            return "";
    }
}
