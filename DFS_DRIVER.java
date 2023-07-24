package labsheet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
class Graph2 {
private int[][] adjacencyMatrix;
private int numVertices;
public Graph2(int numVertices) {
this.numVertices = numVertices;
adjacencyMatrix = new int[numVertices][numVertices];
}
public void addEdge(int source, int destination) {
adjacencyMatrix[source][destination] = 1;
adjacencyMatrix[destination][source] = 1;
}
public void dfs(int startVertex) {
boolean[] visited = new boolean[numVertices];
Stack<Integer> stack = new Stack<>();
visited[startVertex] = true;
System.out.print(startVertex + " ");
stack.push(startVertex);
while (!stack.isEmpty()) {
int currentVertex = stack.pop();
for (int i = 0; i < numVertices; i++) {
if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
visited[i] = true;
System.out.print(i + " ");
stack.push(i);
}
}
}
System.out.println();
}
}

public class DFS_DRIVER {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of vertices: ");
        int numVertices = scanner.nextInt();
        Graph2 graph = new Graph2(numVertices);
        System.out.print("Enter the edges in the form (v1,v2): ");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] edges = input.split("\\),\\s*\\("); // Updated regular expression
        for (String edge : edges) {
            edge = edge.replaceAll("\\(|\\)", "");
            String[] vertices = edge.split(",");
            int v1 = Integer.parseInt(vertices[0]);
            int v2 = Integer.parseInt(vertices[1]);
            graph.addEdge(v1, v2);
        }
        System.out.println("DFS traversal:");
        graph.dfs(0);
        scanner.close();
    }
	}


