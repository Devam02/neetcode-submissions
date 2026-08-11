class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // In HashMap we have occurrence
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)-> map.get(b)-map.get(a));

        // push in the pq

        for(int num:map.keySet())
        {
            p.offer(num);
        }
        int result[]=new int[k];

        for(int i=0;i<k;i++)
        {
            result[i]=p.poll();
        }

        return result;




        
    }
}
