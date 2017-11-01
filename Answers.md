#### What is the purpose of the various auxiliary methods `populateList`, `populateFifoList`, and `ReverseLines.printReverse`?

To be able to add lines to the list in specific orders and to print them out recursively without using a loop.

#### Why do these methods need to have arguments, and how does the argument change from one recursive call to the next?

In order to run it recursively, the method needs to be able to do something to change the argument before it is passed through it again, so that it will eventually reach a base case.  The argument will change to the next node or the next input as it goes.

#### What are the time and space complexity of each of the `populateList` and `populateFifoList` methods, as well as `ReverseLines.printReverse`?

`populateList`
* time = O(n)
* space = O(n)

`populateFifoList`
* time = O(n)
* space = O(n)

`ReverseLines.printReverse`
* time = O(n)
* space = O(n)

#### Which of these methods can be implemented using while loops?

All of them.