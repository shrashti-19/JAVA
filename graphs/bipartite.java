import java.util.*;

public class bipartite{
    static class Edge{
        int src;
        int dest;
        //int weight;

        public Edge(int s, int d){
            this.src = s;
            this.dest =d;
            //this.weight = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[]graph, int V){
        for(int i=0 ;i<V ; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,1));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
        graph[4].add(new Edge(4,2));
    }

    public static boolean bipartitiecheck(ArrayList<Edge>[]graph){
        int[] color = new int[graph.length];
        for(int i=0 ; i<color.length ; i++){
            color[i]=-1;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0 ; i<graph.length ; i++){
            if(color[i]==-1){
                q.add(i);
                while(!q.isEmpty()){
                    int curr = q.remove();
                    Edge e = graph[curr].get(i);
                    //case1 
                    if(color[e.dest]==-1){
                        int nextcolor = color[curr]==0 ? 1 : 0;
                        color[e.dest] = nextcolor;
                        q.add(e.dest);
                    }else if(color[e.dest]== color[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int V= 5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph,V);
        System.out.println(bipartitiecheck(graph));
    }
}