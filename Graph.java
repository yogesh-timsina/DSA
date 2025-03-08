import java.util.*;

class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjLists;
    private boolean[] visited;

    // Graph creation
    Graph(int vertices) {
        numVertices = vertices;
        adjLists = new LinkedList[vertices];
        visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    // Add edge
    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    // BFS traversal
    void BFS(int startVertex) {
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int adj : adjLists[vertex]) {
                if (!visited[adj]) {
                    visited[adj] = true;
                    queue.add(adj);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Breadth First Traversal starting from vertex 2:");

        g.BFS(2);
    }
}
