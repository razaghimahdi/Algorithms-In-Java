package bfs;

public class Application {
    public static void main(String[] args) {
        Bfs bfs=new Bfs();

        Vertex vertex1=new Vertex(1);/**so we start at vertex1 we should get one because we visited:Vertex{data=1} */
        Vertex vertex2=new Vertex(2);
        Vertex vertex3=new Vertex(3);
        Vertex vertex4=new Vertex(4);
        Vertex vertex5=new Vertex(5);
/*
        vertex1.addNeighbourVertex(vertex2);
        vertex1.addNeighbourVertex(vertex3);
        vertex1.addNeighbourVertex(vertex4);

        vertex2.addNeighbourVertex(vertex1);

        vertex4.addNeighbourVertex(vertex3);

        vertex5.addNeighbourVertex(vertex3);
        vertex5.addNeighbourVertex(vertex2);


        bfs.bfs(vertex2);
*/


        vertex1.addNeighbourVertex(vertex2);/**the we visit neighbour 2 and 4 , so vertex1 going to have a list and the list will have two items,vertex2 and vertex4: Vertex{data=2} Vertex{data=4}*/
        vertex1.addNeighbourVertex(vertex4);/**it doesn't matter whether the vertex 2 is the first one or the vertex4*/
        vertex4.addNeighbourVertex(vertex5);
        vertex2.addNeighbourVertex(vertex3);



        bfs.bfs(vertex1); /**vertex1 is going to be the root. */



    }
}
