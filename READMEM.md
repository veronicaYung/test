Problem 7 (Increasing Sequences - ****)

**Analysis:**

- this question took a lot of time to do because different test cases created different problems, if I were to code it again I would have approached it by developing a stronger algorithm and try more test cases before actually coding
- a different approach to this question would be subtracting the numbers to see if they are larger or smaller than the previous (more computer approach when you don't know what's considered larger or smaller), another approach would be having a variable that constantly checks if the there was ascending or descending numbers rather than having them as two different numbers

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition**
    - user input, detecting positive numbers
    - detecting the longest sequence
    - detecting the amount of 3 descending numbers
2. **pattern recognition:** similarities among problems and data
    - ascending, descending numbers
3. **abstraction:** more general representation
    - removing unnecessary details:
        - displaying numbers after entering numbers( it shows regardless)
    - necessary components/possible variables
        - highest streak
        - descended
        - streak
        - current number
        - previous number
4. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - While user still wants to input numbers
        - ask user to enter positive integer
            - if answer is no
                - if it is, increase the tally of rained days
                - reset the amount of non rained days
            - and if the answer is yes
                - if it is, increase the tally of non rained days
                    - if there are 3 or more rained days, stop asking and water garden
            - if the answer is random
                - ask them to re-enter an answer
        - check if the number is a number
            - if the current number > previous number #increasing
                - increase your highest streak
                - swap your current number, make it the previous now
            - if the next number < previous #decreasing
                - increase the failed streak
                - the failed streak is 3
                    - print highest streak
                    - stop asking
                - the failed streak < 3 but not 0
                    - Makes the current number into the previous
                    - Reset the highest streak
            - If the next number is greater than the previous:
                - Reset plunder to 0
        - If its not a number or you want to exit:
            - Print the highest streak
            - Stop asking
