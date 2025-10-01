import java.util.*;

public class hasPath {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
// T.C -> O(V+E)
    public static boolean haspath(ArrayList<Edge>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            // e.dest = neighbour
            if (!vis[e.dest] && haspath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int v = 7;
        ArrayList<Edge> graph[] = new ArrayList[v];
        for (int i = 0; i < v; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges (undirected for example)
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));
        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
        graph[4].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(5, 6, 1));

        System.out.println(haspath(graph, 0, 5, new boolean[v])); // true
        System.out.println(haspath(graph, 0, 6, new boolean[v])); // true
        System.out.println(haspath(graph, 1, 6, new boolean[v])); // true
        System.out.println(haspath(graph, 4, 0, new boolean[v])); // false (directed edges)
    }
}
