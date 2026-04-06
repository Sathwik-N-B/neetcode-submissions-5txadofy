class Solution {

    public String encode(List<String> strs) {
        String msg = "";
        for(int i=0; i<strs.size();i++) {
            int count = 0;
            String s = strs.get(i);
            count = s.length();
            msg = msg + count + "#" + s;
        }
        return msg;
    }

    public List<String> decode(String str) {
        List<String> msg = new ArrayList<>();
        int i=0;
        while(i<str.length()) {
            int length = 0;

            while(i<str.length() && Character.isDigit(str.charAt(i))) {
                length = length * 10 + (str.charAt(i) - '0');
                i++;
            }
            i++;
            String word = str.substring(i, i + length);
            i+=length;
            msg.add(word);
        }
        return msg;
    }
}
