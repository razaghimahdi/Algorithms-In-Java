# Algorithms-In-Java
there is some example Algorithms in java for Design pattern 

### This project developed by Mahdi razzaghi ghaleh

# Graphs
Graphs G(V, E) are mathematical structures to model pairwise relations between given objects
A graph is made up of vertices/nodes and edges
There are 2 types of Graphs: directed and undirected graphs

### How to model them in programming languages?
Adjacency matrixes
edge list representation

### Why is it important to learn about graphs and graphs algorithms?
shortest path algorithm(GPS...).
graph traversing:web crawlers for google.
spanning trees.
maximum flow problems: lots of problems can be reduced to maximum flow.
because there are two representations for graphs: we can handle problems with matrixes as well.

##### That's why most of google's algorithms have something to do with matrix relatedoperations although  they are graph algorithms


## Breadth first search(BFS)
we usually refer to it as BFS, it stands for breadth-first search.
##### What is it good for? 
For Example we have a graph and we want to visit every node so we can do it with BFS
We visit every vertex exactly once.
We visit the neighbours then the neighbours of these new vertices and so on.
The running time complexity is linear in the sense that it's going to be O(V+E) where V denote the number of vertices or nodes in the graph and E denotes the number of the edges in the graph.
The memory complexity is not that good because we have to store lots of references or pointers in a queue abstract data type.


