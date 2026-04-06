class Solution {
    public boolean isAnagram(String s, String t) {
        char schar[] = s.toCharArray();
        char tchar[] = t.toCharArray();
    
        Arrays.sort(schar);
        Arrays.sort(tchar);

        s = new String(schar);
        t = new String(tchar);
        
        if(s.equals(t)) {
            return true;
        } else {
            return false;
        }
        
    }
}
