public class class40 {

    public static boolean areRotations(String s1, String s2){
        // if(s1.length() != s2.length()) return false;
        // int len = s1.length();
        // for(int i=0; i<len; i++){
        //     s1 = s1.substring(1) + s1.substring(0, 1);
        //     if(s2.equals(s1)) return true;
        // }
        // return false;

        //Approach 2

        if(s1.length() != s2.length()) return false;
        String str = s1 + s1;
        return str.contains(s2);
    }
    public static void main(String[] args) {
        String s = "ABCD";
        String s2 = "DABC";
        System.out.println(areRotations(s, s2));
    }
}
