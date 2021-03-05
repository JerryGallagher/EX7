package q1.extract_method.refactored;

import java.util.List;

//import p5.extract_method_typeparameterize.refactored.Graph;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
	   extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   /**
    * Extract Method Refactoring by Type Parameterizing
    */
   <T extends Graph> void extractedMethod(List<T> objs, String p) {
      for (T obj : objs) {
         if (obj.contains(p))
            System.out.println(obj);
      }//end of for
   }//end of extractedMethod

}

class Graph {
	String name;
	
	public boolean contains(String p) {
		return name.contains(p);
	}
}//end of class Graph

class Node extends Graph {
 
}

class Edge extends Graph {

}