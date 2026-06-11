class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()>t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(map.containsKey(c)){
                int count = map.get(c);
                if(count>0){
                    map.put(c, count-1);
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return true;
    }
}
