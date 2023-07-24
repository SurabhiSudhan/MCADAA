package labsheet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
class Graph {
private int[][] adjacencyMatrix;
private int numVertices;
public Graph(int numVertices) {
this.numVertices = numVertices;
adjacencyMatrix = new int[numVertices][numVertices];
}
public void addEdge(int source, int destination) {
adjacencyMatrix[source][destination] = 1;
adjacencyMatrix[destination][source] = 1;
}
public void bfs(int startVertex) {
boolean[] visited = new boolean[numVertices];
Queue<Integer> queue = new LinkedList<>();
visited[startVertex] = true;
System.out.print(startVertex + " ");
queue.offer(startVertex);
while (!queue.isEmpty()) {
int currentVertex = queue.poll();
for (int i = 0; i < numVertices; i++) {
if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
visited[i] = true;
System.out.print(i + " ");
queue.offer(i);
}
}
}
System.out.println();
}
}
public class BFS_DRIVER {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of vertices: ");
		int numVertices = scanner.nextInt();
		Graph graph = new Graph(numVertices);
		System.out.print("Enter the edges in the form (v1,v2): ");
		scanner.nextLine(); // Consume the newline character
		String input = scanner.nextLine();
		String[] edges = input.split("\\),\\s*\\(");
		for (String edge : edges) {
		edge = edge.replaceAll("\\(|\\)", ""); // Remove parentheses
		String[] vertices = edge.split(",");
		int v1 = Integer.parseInt(vertices[0]);
		int v2 = Integer.parseInt(vertices[1]);
		graph.addEdge(v1, v2);
		}
		System.out.println("BFS traversal:");
		graph.bfs(0);
		scanner.close();
	}

	}


