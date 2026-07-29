class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        dictmap = defaultdict(int)
        for i in range(len(s)):
            dictmap[s[i]] += 1 

        for i in range(len(t)):
            if t[i] in dictmap:
                count = dictmap.get(t[i])

                if count > 0:
                    dictmap[t[i]] -= 1;
                else:
                    return False
            else:
                return False
        
        return True

        
        
        