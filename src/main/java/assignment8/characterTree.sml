datatype binaryTree = Leaf
    	        | Node of (char * binaryTree * binaryTree);

fun findNode(Leaf) = 0
| findNode(Node(c,t1,t2)) =
    if(t1=Leaf) then
    if(t2=Leaf) then stringFrom(c)^findNode(t1) else stringFrom(c)^findNode(t2)
    else
    if(t2=Leaf) then stringFrom(c) else findNode(tl)^findNode(t2) ;