class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String s: strs) {
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            anagram.putIfAbsent(sortedStr, new ArrayList<>());
            anagram.get(sortedStr).add(s);
        }
        return new ArrayList<>(anagram.values());
    }
}
