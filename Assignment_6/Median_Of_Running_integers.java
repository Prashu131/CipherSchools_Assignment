package Assignment_6;
import java.util.Collections;
import java.util.PriorityQueue;

public class Median_Of_Running_integers {
        public static void printMedian(int[] a)
        {

            double med = a[0];
            PriorityQueue<Integer> smaller = new PriorityQueue<>
                    (Collections.reverseOrder());
            PriorityQueue<Integer> greater = new PriorityQueue<>();
            smaller.add(a[0]);
            System.out.println(med);
            for(int i = 1; i < a.length; i++)
            {
                int x = a[i];
                if(smaller.size() > greater.size())
                {
                    if(x < med)
                    {
                        greater.add(smaller.remove());
                        smaller.add(x);
                    }
                    else
                        greater.add(x);
                    med = (double)(smaller.peek() + greater.peek())/2;
                }
                else if(smaller.size() == greater.size())
                {
                    if(x < med)
                    {
                        smaller.add(x);
                        med = (double)smaller.peek();
                    }
                    else
                    {
                        greater.add(x);
                        med = (double)greater.peek();
                    }
                }
                else
                {
                    if(x > med)
                    {
                        smaller.add(greater.remove());
                        greater.add(x);
                    }
                    else
                        smaller.add(x);
                    med = (double)(smaller.peek() + greater.peek())/2;

                }
                System.out.println(med);
            }
        }
        public static void main(String []args)
        {
            int[] arr = new int[]{5, 10,28,43,3};
            printMedian(arr);
        }
}
