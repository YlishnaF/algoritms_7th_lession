public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();
        Graph graph = new Graph();
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('H');

        graph.addEdge(0,1); //AB
        graph.addEdge(1,2); //BC
        graph.addEdge(0,3); //AD
        graph.addEdge(3,4); //DE

        graph.dfs();
        graph.dfs(0);
        graph.bfsWidth();
        graph.bfsWidth(1);

        System.out.println("Время выполнения методов " + (System.nanoTime() - start));

    }
}
