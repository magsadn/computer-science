# Data Structures and Algorithms

## BigO
*Big O notation is a mathematical notation that 
describes the limiting behavior of a function when the argument tends towards a particular value or infinity.*

## Arrays
*Arrays are the simplest data structures and we use to store list of items, 
like list of strings, numbers, objects and literally anything. This items gets stored sequentially in memory.* <br/> <br/>
Lookup  O(1) - Array time complexity is O(1) because of indexing. <br/>
Insert  O(n) - Because of adding to the end of the array. <br/>
Delete  O(1) - The best scenario if deleting last index. <br/>
Delete  O(n) - The worst scenario if deleting first index. <br/>
Because after deleting the first index all elements hava to shift left hole in one iteration. <br/>

### ArrayList
ArrayList is aren't synchronized. This means you can use multithreading with this collection.
### Vector
Vector is 100% synchronized. This means only single thread access the method.

