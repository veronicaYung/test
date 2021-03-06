Practice Problem #9

Problem 2 (Reversing String - **)

**Analysis:**

- had a very good use of the slicing
- input from another student helped me think intuitively and  map out the question, this is seen in the comment

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition: base cases**
    - if you get to the last letter of the word,return the letter
    - if you slice the whole word, return nothing
2. **pattern recognition:** similarities among problems and data
    - repeatedly slice the next first letter of a word off and return the rest of the word into the function
3. **abstraction:** more general representation
    - necessary components/possible variables
        - user input
4. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - keep slicing the word, isolating the first character each time
    - if the sliced word is not one character
        - keep slicing the first letter off
    - and if nothing is entered
        - return nothing
    - keep passing the sliced word into the the function
    - when the last letter gets passed up, it will keep adding the letter+ the previous first letter from the call stack

Problem 5 (Factorials and Caching - **)

**Analysis:**

- recently I read about "memoization" and how it is a dynamic programming approach. Seeing that recursive problems often have runtimes of O(branches^depth), this can look like  O(8^n) which we have learned is one of the worst runtimes. This question perfectly demonstrates how efficient caching with dictionaries can be, it reduces the runtime from O(2^n) to O(1) if the factorial has already been calculated previously

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition**
    - what/where am I going to cache
    - how do I get the factorial of a number?

1. **pattern recognition:** similarities among problems and data
    - using dictionaries
2. **abstraction:** more general representation
    - necessary components/possible variables
        - factorial
        - dictionary of queue
3. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - if the number is in the queue, return the corresponding factorial of the number

    - if the number is not 0
        - keep following the pattern of number x number!
    - assuming all positive entries, we return 1 if the input is 0
