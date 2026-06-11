class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            int[] charCount = new int[26];
            Arrays.fill(charCount, 0);
            for(char c : s.toCharArray()){
                charCount[c-'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for(int c : charCount){
                sb.append(c);
                sb.append('#');
            }

            if(!map.containsKey(sb.toString())){
                map.put(sb.toString(), new ArrayList<>());
            }
            map.get(sb.toString()).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
