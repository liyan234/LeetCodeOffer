package D20210214;

public class D3 {
    public String reverseLeftWords(String s, int n) {
        String res = "";
        for (int i = n; i < s.length()+n; i++) {
            res += s.charAt(i % s.length());
        }
        return res;
    }
}
