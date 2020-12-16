package D20201216;

public class D3 {
    public String replaceSpace(String s) {
        int len = s.length();
        if(len == 0) {
            return s;
        }
        //StringBuilder sb = new StringBuilder();
        String sb = "";
        for (int i = 0; i < len ; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                //sb.append("%20");
                sb = sb + "%20";
            } else {
                //sb.append(c);
                sb = sb + c;
            }
        }
        // return sb.toString();
        return sb;


    }
}
