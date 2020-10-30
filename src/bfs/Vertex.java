package bfs;

import java.util.ArrayList;
import java.util.List;

/**NOTE: vertex class is going to represent the vertices in Autograph.
 * */

public class Vertex {

   private int data;
   private boolean visited;/**this boolean gonna check which we have visited this a vertex or not. */
   private List<Vertex> neighbourList;/**it's going to contain all the neighbouring vertices.*/

   public Vertex(int data) {
      this.data = data;
      this.neighbourList = new ArrayList<>();
   }


   public int getData() {
      return data;
   }

   public void setData(int data) {
      this.data = data;
   }

   public boolean isVisited() {
      return visited;
   }

   public void setVisited(boolean visited) {
      this.visited = visited;
   }

   public List<Vertex> getNeighbourList() {
      return neighbourList;
   }

   public void setNeighbourList(List<Vertex> neighbourList) {
      this.neighbourList = neighbourList;
   }


   public void addNeighbourVertex(Vertex vertex){
      this.neighbourList.add(vertex);
   }


   @Override
   public String toString() {
      return "Vertex{" +
              "data=" + data /*+
              ", visited=" + visited +
              ", neighbourList=" + neighbourList*/ +
              '}';
   }
}
