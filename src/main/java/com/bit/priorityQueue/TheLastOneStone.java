package com.bit.priorityQueue;

import java.util.PriorityQueue;

public class TheLastOneStone {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxQueue=new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int a:stones){
            maxQueue.offer(a);
        }
        while(maxQueue.size()>1){
            int a= maxQueue.poll();
            int b= maxQueue.poll();

            maxQueue.offer(Math.abs(a-b));
        }
        if (maxQueue.isEmpty())
            return 0;
        else {
            return maxQueue.poll();
        }
    }
}
