
import java.util.PriorityQueue;

public class fifth{
    static class Row implements Comparable<Row>{
        int soldierCount;
        int index;

        public Row(int soldierCount, int index){
            this.soldierCount = soldierCount;
            this.index = index;
        }

        @Override
        public int compareTo(Row other){
            if(this.soldierCount == other.soldierCount){
                return this.index - other.index;
            }else{
                return this.soldierCount - other.soldierCount;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<Row> pq = new PriorityQueue<>();
        for(int i=0 ; i<matrix.length ; i++){
            int count =0 ;
            for(int j=0 ; j<matrix[0].length ; j++){
                // int count = 0;
                count+=matrix[i][j] == 1 ? 1 : 0;

            }
            pq.add(new Row(count, i));
        }
        for(int i=0 ; i<k ; i++){
            System.out.println("R " + pq.remove().index);
        }
    }
}