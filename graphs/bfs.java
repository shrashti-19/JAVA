import java.util.*;


public class bfs{
    static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w){
            this.src = s;
            this.dest =d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge>[]graph, int V){
        for(int i=0 ;i<V ; i++){
            graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,5));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,3,3));


        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));
       
       

        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,2));
        graph[4].add(new Edge(4,5,1));
        graph[4].add(new Edge(4,3,1));

        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));
        graph[5].add(new Edge(5,6,1));

        graph[6].add(new Edge(6,5,1));

    }
    public static void bfs(ArrayList<Edge>[]graph){
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        boolean[]visited = new boolean[graph.length];

        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.err.println(curr + " ");
                visited[curr] = true;

                for(int i=0 ; i<graph[curr].size() ; i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[]visited){

        System.out.print(curr + " ");
        visited[curr] = true;

        for(int i=0 ; i<graph[curr].size() ; i++){
            
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static boolean hasPath(ArrayList<Edge>[]graph, int src, int dest, boolean[]visited){
        if(src==dest) return true;
        visited[src] = true;
        for(int i=0 ; i<graph[src].size() ; i++){
            Edge e = graph[src].get(i); //neighbors

            if(!visited[e.dest] && hasPath(graph, e.dest, dest, visited)){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph, V);
        bfs(graph);

        //System.out.println("DFS traversal");
        boolean[] visited = new boolean[V];
        //dfs(graph,0, visited);

        System.out.println("Has Path or not? " + hasPath(graph, 0, 5, visited));
    }
}