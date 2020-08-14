package algoExpertProblems.graphs;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DFSTest {

	@Test
	  public void TestCase1() {
	    DFS.Node graph = new DFS.Node("A");
	    graph.addChild("B").addChild("C").addChild("D");
	    graph.children.get(0).addChild("E").addChild("F");
	    graph.children.get(2).addChild("G").addChild("H");
	    graph.children.get(0).children.get(1).addChild("I").addChild("J");
	    graph.children.get(2).children.get(0).addChild("K");
	    String[] expected = {"A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"};
	    List<String> inputArray = new ArrayList<String>();
	    assertTrue(compare(graph.depthFirstSearch(inputArray), expected));
	  }

	  public static boolean compare(List<String> arr1, String[] arr2) {
	    if (arr1.size() != arr2.length) {
	      return false;
	    }
	    for (int i = 0; i < arr1.size(); i++) {
	      if (!arr1.get(i).equals(arr2[i])) {
	        return false;
	      }
	    }
	    return true;
	  }

}
