import java.util.*;
public class HelloWorld{

     public static void main(String []args){
        
        Graph g = new Graph();
        
        g.addVertex(new Node(1));
        g.addVertex(new Node(2));
        g.addVertex(new Node(3));
        g.addVertex(new Node(4));
        
        g.printGraph();
        
        
        Graph g2 = new Graph();
        g2.addEdge(new Node(1), new Node(2));
        g2.printGraph();
        
        Graph g3 = new Graph();
        
        Node node = new Node(5);
        
        g3.addEdge(node, new Node(2));
        
        System.out.println(g3.hasVertex(node));
        
        
     }
}


class Graph{
    
    HashMap<Node,List<Node>> map = new HashMap<>();
    
    
    public void addVertex(Node node){
        map.put(node, new LinkedList<Node>());
    }
    
    public void addEdge(Node start, Node end){
        if(!map.containsKey(start)){
            map.put(start,new LinkedList<Node>());
        }
        
        if(!map.containsKey(end)){
            map.put(end,new LinkedList<Node>());
        }
        
        map.get(start).add(end);
    }
    
    public boolean hasVertex(Node node){
        return map.containsKey(node);
    }
    
    public void printGraph(){
        for(Node v : map.keySet()){
            System.out.println(v.data);
        }
    }
}


class Node{
    Integer data;
    
    public Node(Integer data){
        this.data = data;
    }
    
    @Override
    public boolean equals(Object o){
        if (o == this) { 
            return true; 
        } 
        if (!(o instanceof Node)) { 
            return false; 
        } 
        Node node = (Node) o ;
        return node.data == this.data;
    }
}
