package strings;

public class HasSubString {

    public static void main(String[] args) {
        String haystack = "boysadissad";
        String needle = "sad";
        int index = strStr(haystack, needle);
        System.out.println("Found substring at: "+ index);
    }

    private static int strStr(String mainStr, String subStr) {

        for(int i=0; i<mainStr.length(); i++){

            /**
             * increment i till match with starting letter of substring
             */
            while(i < mainStr.length() && mainStr.charAt(i) != subStr.charAt(0)){
                i++;
            }
            if(i < mainStr.length()) {
                int trackSubStr = 0;
                int trackMainStr = i;
                while(trackSubStr < subStr.length() && trackMainStr < mainStr.length()) {
                    if(subStr.charAt(trackSubStr) == mainStr.charAt(trackMainStr)) {
                        trackMainStr++;
                    }
                    trackSubStr++;
                }
                if((trackMainStr - i) == subStr.length()){
                    return i;
                }
            }

        }
        return -1;
    }
}
