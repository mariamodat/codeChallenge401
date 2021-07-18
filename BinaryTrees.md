# Binary Trees and Binary Search Trees
## Challenge
Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.

Create a BinaryTree class

Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

Create a BinarySearchTree class

Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.

Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
Binary Tree

Time Complexity of the Depth First traversals are all O(n + m), where n is the # of nodes, and m is the # of edges.
Traversals were done via recursion using private helper functions that takes in the arraylist to add values and eventually return, and a BinaryTreeNode.
Binary Search Tree

insertValue -> Time Complexity is O(h), where h is the height of the tree. This was done via recursion.
containsValue -> Time Complexity is O(h), where h is the height of the tree. This was done via recursion.