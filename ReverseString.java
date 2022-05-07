public class ReverseString {

    public static void main(String[] args) {
        char[] s ={'a','b','c','d'};
        ReverseString.reverseString(s);
        if (s[0]=='d'&& s[1]=='c'&& s[2]=='b'&& s[3]=='a') {
            System.out.println("Test pass");
        } else {
            System.out.println("Test fail");
        }
    }

    public static void reverseString(char[] s) {
        
        for(int i =0;i<s.length/2;i++){
            char x = s[i];
            s[i] = s[(s.length-1)-i];
            s[(s.length-1)-i] = x;
        }
    
}
}
