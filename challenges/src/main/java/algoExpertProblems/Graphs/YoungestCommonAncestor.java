package algoExpertProblems.Graphs;

public class YoungestCommonAncestor {
	
	// Time: O(d) || Space: O(1) where d is the depth of the tree
	public static AncestralTree getYoungestCommonAncestor(
		AncestralTree topAncestor, AncestralTree descendantOne, AncestralTree descendantTwo) {
		var d1AncestorCount = getAncestorCount(descendantOne);
		var d2AncestorCount = getAncestorCount(descendantTwo);
		
		if(d1AncestorCount>=d2AncestorCount){
			descendantOne = getLeveledAncestor(descendantOne, d1AncestorCount, d2AncestorCount);
		}else {
			descendantTwo = getLeveledAncestor(descendantTwo, d2AncestorCount, d1AncestorCount);
		}
		
		while (descendantOne.name != descendantTwo.name) {
			descendantOne = descendantOne.ancestor;
			descendantTwo = descendantTwo.ancestor;
		}
		
		return descendantTwo; 
	}

	private static AncestralTree getLeveledAncestor(AncestralTree descendant, 
		int firstAncestorCount, int secondAncestorCount) {
		int diff = firstAncestorCount - secondAncestorCount;
		while(diff!=0) {
			descendant = descendant.ancestor;
			diff--;
		}
		return descendant;
	}

	private static int getAncestorCount(AncestralTree descendant) {
		var ancestorCount = 0;
		AncestralTree currentNode = descendant;
		while(currentNode != null) {
			currentNode = currentNode.ancestor;
			ancestorCount++;
		}
		return ancestorCount;
	}

	static class AncestralTree {
	    public char name;
	    public AncestralTree ancestor;

	    AncestralTree(char name) {
	      this.name = name;
	      this.ancestor = null;
	    }
	    
	    // This method is for testing only.
	    void addAsAncestor(AncestralTree[] descendants) {
	      for (AncestralTree descendant : descendants) {
	        descendant.ancestor = this;
	      }
	    }
	}
}
