package D20210214;

public class D2 {
    public String reverseWords(String s) {
        String[] str = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = str.length - 1; i >= 0; i--) {
            if(str[i].equals("")) {
                continue;
            }
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();

    }
}
