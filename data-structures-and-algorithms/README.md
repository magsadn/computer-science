# Data Structures and Algorithms

## BigO
*Big O notation is a mathematical notation that 
describes the limiting behavior of a function when the argument tends towards a particular value or infinity.*

## Arrays
*Arrays are the simplest data structures and we use to store list of items, 
like list of strings, numbers, objects and literally anything. These items gets stored sequentially in memory.* <br/> <br/>
Lookup by index  O(1) - Array time complexity is O(1) because of indexing. <br/>
Lookup by value  O(n) - Array time complexity is O(n) because of searching the element in the array. <br/>
Insert  O(n) - Because of adding to the end of the array. <br/>
Delete  O(1) - The best scenario if deleting last index. <br/>
Delete  O(n) - The worst scenario if deleting first index. <br/>
Because after deleting the first index all elements hava to shift left hole in one iteration. <br/>

### ArrayList
ArrayList is aren't synchronized. This means you can use multithreading with this collection.
### Vector
Vector is 100% synchronized. This means only single thread access the method.

## LinkedLists
*LinkedLists are used to store a list of objects in sequence. But unlike arrays linked lists grow and shrink automatically.*
LinkedLists consist of a group of nodes and sequences. Each node holds two pieces of data; one is a value and other is a address of the next node in the list.
Each node points to or references the next node.
Lookup by value O(n) <br>
Lookup by index O(n) <br>
Insert at the end O(1) <br>
Insert at the beginning O(1) <br>
Insert at the middle O(n) <br>
Delete from the beginning O(1) <br>
Delete from the end O(n) <br>
Delete from the middle O(n) <br>

## Arrays vs Linked lists
### Space
 - Static arrays have a fixed size
 - Dynamic arrays grow by 50-100%
 - Linked lists don't waste memory
 - Use arrays if you know the number of items to store
 - new ArrayList(100)
### Runtime complexity
                            Arrays      Linked Lists
    Lookup
            By index        O(1)            O(n)
            By Value        O(n)            O(n)
    Insert 
            Beginning/End   O(n)            O(1)
            Middle          O(n)            O(n)
    Delete
            Beginning       O(n)            O(1)
            Middle          O(n)            O(n)
            End             O(n)            O(n)/O(1)(double linkedlist)
