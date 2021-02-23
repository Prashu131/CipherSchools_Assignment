package Assignment_6;
import java.util.*;
public class N_Ropes_With_Min_Cost {
        static int minCost(int arr[], int n)
        {
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
            for (int i = 0; i < n; i++) {
                pq.add(arr[i]);
            }
            int res = 0;
            while (pq.size() > 1) {
                int first = pq.poll();
                int second = pq.poll();
                res += first + second;
                pq.add(first + second);
            }
            return res;
        }
        public static void main(String args[])
        {
            int len[] = { 4, 6, 3, 5 };
            int size = len.length;
            System.out.println("Total cost for connecting" + " ropes is " + minCost(len, size));
        }
}

