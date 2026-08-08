class Solution {
    public int lastStoneWeight(int[] stones) {
        
        int n = stones.length ;
        if(n==1)return stones[0];
        if(n==2)return stones[0]>stones[1] ? stones[0]-stones[1] : stones[1]-stones[0];

        PriorityQueue<Integer> pq = new PriorityQueue<>       (Collections.reverseOrder());

        for (int st : stones) {
            pq.add(st); // O(log n) per insertion
        }
        
        

   

        while(pq.size() > 1){

            int max1 = pq.poll();
            int max2 = pq.poll();
            int numToAdd = max1-max2 ;

            

            if(max1 != max2)pq.add(numToAdd);
            else {
                if(pq.size() == 0)pq.add(0);
            }
        }

        return pq.peek();

     }
}
