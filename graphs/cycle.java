import java.util.*;

public class cycle{
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
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,3));
    }

    public static boolean cycleDetection(ArrayList<Edge>[]graph){
        boolean visited[] = new boolean[graph.length];
        for(int i=0 ; i<graph.length ; i++){
            if(!visited[i]){
                if(cycleDetectionUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cycleDetectionUtil(ArrayList<Edge>[]graph, boolean[]visited, int curr, int parent){
        visited[curr]=true;

        for(int i=0 ; i<graph.length ; i++){
            //case:1 not visited
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                if(cycleDetectionUtil(graph, visited, e.dest, curr)){
                    return true;
                }
            }else if(visited[e.dest] && e.dest!=parent){
                return true;
            }
        }
        return false;


        // 3 cases: 1) not vistied, 2) visited but not equal to parent 3) visited and equal to parent continue


    }

    public static void main(String args[]){
        int V=5;
        ArrayList<Edge>[]graph = new ArrayList[V];
        createGraph(graph,V);

        System.out.println(cycleDetection(graph));
    }
}