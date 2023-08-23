# Week 1 Programming Prompt

## The `BST`

What are the properties of a Binary Search Tree (`BST`)
* A `Tree` is composed of `Nodes`
    * A `Node` holds a value
    * A `Node` may contain references to other `Node`s, called children or child `Node`s
* A `Tree` has a root `Node`
* A `BST` only permits two child `Node`s per `Node`
* A `BST` requires that new `Node`s are inserted such that:
    * All values in `Node`s in the right subtree are greater than the value in the root of the subtree
    * All values in `Node`s in the left subtree are less than (or equal to) the value in the root of the subtree 

What behaviors are supported by the BST?
* Inserting values
    * Values, not Nodes! 
    * Nothing outside of the BST object should know about the internal representation of the BST, or how the BST stores values. Why is this important?
* Finding values
* Counting values
* Possibly some others, but we won’t implement them (i.e. deleting, printing)