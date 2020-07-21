package algoExpertProblems.BinarySearchTree;

public class BSTConstruction {
	static class BST {
	    public int value;
	    public BST left;
	    public BST right;

	    public BST(int value) {
	      this.value = value;
	    }

	    public BST insert(int value) {
			BST currentNode = this;
 			while (true) {
 				if (value < currentNode.value) {
					if (currentNode.left == null) {
						BST newNode = new BST(value);
						currentNode.left = newNode;
						break;
					} else {
						currentNode = currentNode.left;
					}
 				} else {
					if (currentNode.right == null) {
						 BST newNode = new BST(value);
						 currentNode.right = newNode;
						 break;
					} else {
						currentNode = currentNode.right;
					}
 				}
 			}
 			
 			return this;
	    }
	    
	    public boolean contains(int value) {
	    	 BST currentNode = this;
	    	 while (currentNode != null) {
	    		 if (value < currentNode.value) {
	    			 currentNode = currentNode.left;
	    		 } else if (value > currentNode.value) {
	    			 currentNode = currentNode.right;
	    		 } else {
	    			 return true;
	    		 }
	    	 }
	    	 return false;
	    }
	    
	    public BST remove(int value) {
	    	remove(value, null);
	    	return this;
	    }
	    
		public void remove(int value, BST parentNode){
		    BST currentNode = this;
	    	while(currentNode!=null) {	    		
    			if(value < currentNode.value){
					parentNode = currentNode;
					currentNode = currentNode.left;
    			}else if(value > currentNode.value){
					parentNode = currentNode;
					currentNode = currentNode.right;
    			}else{
					if(currentNode.left != null && currentNode.right != null){
						currentNode.value = currentNode.right.getMinValue();
						currentNode.right.remove(currentNode.value, currentNode);
					}else if(parentNode==null){
						if(currentNode.left != null){
							currentNode.value = currentNode.left.value;
							currentNode.right = currentNode.left.right;
							currentNode.left = currentNode.left.left;
						}else if(currentNode.right != null){
							currentNode.value = currentNode.right.value;
							currentNode.left = currentNode.right.left;
							currentNode.right = currentNode.right.right;
						}else{
						 //This is a single node tree, do nothing
						}
					}else if(parentNode.left == currentNode){
						parentNode.left = currentNode.left != null ? currentNode.left : currentNode.right;
					}else if(parentNode.right == currentNode){
						parentNode.right = currentNode.left != null ? currentNode.left: currentNode.right;
					}
					break;
    			}
	    	}
		}
		
		private int getMinValue() {
			if(left==null)
				return value;
			else 
				return left.getMinValue();
		}

		// here it worked but finally algo did not work
	    public BST insert1(int value) {
	    	BST newNode = new BST(value);
	    	BST currentNode = this;
	    	while(true) {
	    		if(value>currentNode.value) {
	    			if(currentNode.right==null){
	    				currentNode.right = newNode;
	    				break;
	    			}else
	    				currentNode = currentNode.right;
	    		}else {
	    			if(currentNode.left==null) {
	    				currentNode.left = newNode;
	    				break;
	    			}else
	    				currentNode = currentNode.left;
	    		}
	    			
	    	}
	    	  
	    	return this;
	    }

	    // This one worked
	    public boolean contains1(int value) {
	    	BST currentNode = this;
	    	while(true) {
	    		if(currentNode.value==value)
	    			return true;
	    		
	    		if(value>currentNode.value) {
	    			if(currentNode.right==null)
	    				break;
	    			else
	    				currentNode = currentNode.right;
	    		}else {
	    			if(currentNode.left==null)
	    				break;
	    			else
	    				currentNode = currentNode.left;
	    		}
	    	}
	    	
	    	return false;
	    }


	    // here it worked but finally algo did not work
	    public BST remove1(int value, BST parentNode){
	    	BST currentNode = this;
	    	while(true) {	    		
	    		if(currentNode.value==value) {
	    			if(currentNode.left==null && currentNode.right==null) {
	    				currentNode = null;
	    				break;
	    			}else if(currentNode.right==null) {
	    				if(parentNode.value>currentNode.value)
	    					parentNode.left = currentNode.left;
	    				else
	    					parentNode.right = currentNode.left;
	    				currentNode = null;
	    				break;
	    			}else if(currentNode.left==null) {
	    				if(parentNode.value>currentNode.value)
	    					parentNode.left = currentNode.right;
	    				else
	    					parentNode.right = currentNode.right;
	    				currentNode = null;
	    				break;
	    			}else if(currentNode.left!=null && currentNode.right!=null) {
	    				int rightMindValue = currentNode.right.getMinValue();
	    				currentNode.value = rightMindValue;
	    				
	    				//remove right mindes node
	    				value = rightMindValue;
	    				currentNode = currentNode.right;
	    			}
	    		}
	    		
	    		if(value>currentNode.value) {
	    			if(currentNode.right==null)
	    				break;
	    			else {
	    				parentNode=currentNode;
	    				currentNode = currentNode.right;
	    				}
	    		}else {
	    			if(currentNode.left==null)
	    				break;
	    			else {
	    				parentNode=currentNode;
	    				currentNode = currentNode.left;
	    			}
	    		}
	    	}
	    	
	    	return this;
	    }


	}
}
