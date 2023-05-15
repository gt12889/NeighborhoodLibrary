# NeighborhoodLibrary

This program simulates a library check-in/out system that records the status of the books and its borrows through a CLI. The book name, ISBN, and ID will be recorded into an adjustable list.

Users wil have the ability to edit the library database and can perform the following actions:

◾List all available books  
◾Check out available books  
◾List all checked out books  
◾Check in books  

## CLI Screens

### Home Screen
![image](https://user-images.githubusercontent.com/130225802/233787029-400f56da-8ec4-4fb1-8e40-c12c42f61302.png)


### Book List
![image](https://user-images.githubusercontent.com/130225802/233787015-46594ee0-5210-4db3-b170-0658de3f669d.png)

### Check-In Interface
![image](https://user-images.githubusercontent.com/130225802/233787145-251c76bd-71a7-47b9-89ba-433241445704.png)

### Interesting Code

I think the simple "if" conditional statement below is interesting since it tests to check for the user's integer input as well as the boolean in one line without using &&. The books array is searched until [choice] was matched with the interval then the isCheckedOut() function is called to check to make sure the book is availible . Other methods with "while" or "do-while" loops could achieve the same goal, but this was the most simple in my opinion.

```java
 if (books[choice].isCheckedOut() == false) 
 ```
 
