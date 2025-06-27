
import java.util.PriorityQueue;

// nearby cars
public class third{
    static class point implements Comparable<point>{
        int x;
        int y;
        int distsq;
        int index;
        public point(int x, int y, int distsq, int index){
            this.x = x;
            this.y = y;
            this.distsq = distsq;
            this.index = index;
        }
        @Override
        public int compareTo(point p2){
            return this.distsq - p2.distsq;
        }
    }
    public static void main(String[] args) {
        int points[][] = {{3,3},{5,-1},{-2,4}};
        int k =2;
        //priority queue
        PriorityQueue<point> pq = new PriorityQueue<>();
        for(int i=0 ; i<points.length ; i++){
            int distsq = points[i][0]* points[i][0] + points[i][1] * points[i][1];
            pq.add(new point(points[i][0],points[i][1],distsq,i));
        }

        for(int i=0 ; i<k ; i++){
            System.out.println("C " + pq.remove().index);
        }

    }
}