package bfs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * NOTE: bfs class is going to store the algorithms itself
 */
public class Bfs {

    public void bfs(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>();/**What is Queue? it is basically something that has the so-called FIFO structure.*/

        root.setVisited(true);
        queue.add(root);

        while (!queue.isEmpty()) {
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex + " ");

            for (Vertex v :
                    actualVertex.getNeighbourList()) {
                if (!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }

        }


    }


}
