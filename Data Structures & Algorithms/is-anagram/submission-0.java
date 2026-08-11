class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length())
        {
            return false;
        }

        HashMap<Character,Integer> map=new HashMap<>();

        // Put iN HashMap

        for(char c:s.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // Populateed characters in Map of String s

        for(char c:t.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.getOrDefault(c,0)-1);

                if(map.get(c)<0)
                {
                    return false;
                }
            }
            else
            {
                return false;
            }

            
        }

        for(int count:map.values())
        {
            if(count!=0)
            {
                return false;
            }
        }

        return true;

    }
}
