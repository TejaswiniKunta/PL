datatype binTree = Leaf of int
    	        | Node of (binTree * int * binTree);
fun sumTree  (Leaf(i)) = i
      | sumTree(Node(t1,i,t2)) = sumTree(t1)+ i + sumTree(t2);

