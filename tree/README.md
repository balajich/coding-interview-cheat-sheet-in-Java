# Tree
- Tree is a non-linear data structure.
- Tree is a collection of nodes connected by some edges.
- Tree is a hierarchical data structure.
- Topmost node is called root of the tree.
- Each node contains data and reference to other nodes.
- Nodes other than root node are called child nodes.
- Each node can have any number of child nodes.
- Nodes with no child nodes are called leaf nodes.
- Height of a tree is the length of the longest path from root to leaf node.
- Depth of a node is the length of the path from root to that node.
# Time Complexity

| Operation                                                                                                 | Big-O |
|-----------------------------------------------------------------------------------------------------------|-------|
| create                                                                                                    | O(n)  |
| Access a Character in String                                                                              | O(1)  |
| Insert a Character in any place in given String (Not possible in Java because of immutability of Strings) | O(n)  |
| Remove a Character  in String (Not possible)                                                              | O(n)  |

# Common operations with String
| Operation                                                                                                 | Big-O |
|-----------------------------------------------------------------------------------------------------------|-------|
| Concatenation                                                                                             | O(n)  |
| Substring                                                                                                 | O(n)  |
| Length                                                                                                    | O(1)  |
| Search                                                                                                    | O(n)  |
| Replace                                                                                                   | O(n)  |
| Split                                                                                                     | O(n)  |
| Reverse                                                                                                   | O(n)  |
| Compare                                                                                                   | O(n)  |
| Copy                                                                                                      | O(n)  |
| Traverse                                                                                                  | O(n)  |



# Examples
| File                                                                                                                                   | Description                                                           | Space and Time Complexity                                                                              |
|----------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| [StringCreation](src/main/java/com/yacoders/StringCreation.java)                                                                              | various ways to create a string                                       | Space: O(n) since we create an array of fixed size N , the space complexity is O(1) and Time: O(1)          
| [UsefulStringMethods](src/main/java/com/yacoders/UsefulStringMethods.java)                                                                              | various useful methods in String class like charAt, length,substring, concat||
| [CommonOperations](src/main/java/com/yacoders/CommonOperations.java)    | common operations with String like concatenation, substring, length, search, replace, split, reverse, compare, copy, traverse | Space: O(n) and Time: O(n)                                                                                   |