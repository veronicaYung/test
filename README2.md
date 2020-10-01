Practice Problems #4
### 09/24/2020 - 09/25/2020                                                             Veronica Yung

Side note: worked on most problems with Max

Problem 2 (Vegetable Garden – **)

**Analysis:**

- You can check if the answer is true or false regardless of the capitalization
- I watched lecture 5 and noticed how I didn't define the important variables that I needed to manipulate and so I had some useless code, I have definitely taken note of this.
- As for the algorithm itself, I think it proper uses a lot of the concepts such as while loops, logical operators and has good flow

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition**
    - see if it rained
    - check if it rained 3 times in a row
2. **pattern recognition:** similarities among problems and data
    - recognize 3 rainy days, otherwise the user input is quite random
    - each line is asking the same question
3. **abstraction:** more general representation
    - removing unnecessary details:
        - information about sensor measurements
    - necessary components/possible variables
        - user input
        - rained days
        - non rained days
4. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - While garden hasn't been answered yet
        - ask user if it rained today
            - if answer is yes
                - if it is, increase the tally of rained days
                - reset the amount of non rained days
            - if the answer is no
                - if it is, increase the tally of non rained days
                    - if there are 3 or more rained days, stop asking and water garden
                - if it hasn't rained for 3 days,
                    - go water the plant
                    - stop asking
            - if  the answer is random
                - ask them to re-enter an answer

Problem 5 (Tracking Numbers - **)

**Analysis:**

- I thought my code was really messy and was a bad way to solve it after seeing some solutions with very minimal code which was easy to make into a file reading question but I asked a TA for help and he said it doesn't mean my code is necessarily bad.
- while working with friends I learned a new trick where you use a comma to print string and integer on the same line

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition**
    - print largest number entered
    - print smallest number entered
    - calculate average of numbers
    - number of positive numbers
    - number of negative numbers
2. **pattern recognition:** similarities among problems and data
    - finding lowest and highest number is the same concept
    - finding amount of + and - numbers and averages all need counters
3. **abstraction:** more general representation
    - necessary components/possible variables
        - largest
        - lowest
        - numPos
        - numNeg
        - countNums
        - average
4. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - While asking
        - ask user to enter a number
            - if it is a valid number
                - increase the count of numbers
                - add user input into the total of all numbers entered
                - check if the number is the largest
                    - if so, make user input the largest number
                - check if the number is the lowest
                    - if so, make user input the lowest
                - check if the number is positive
                    - if so, increase count of positive numbers
                - check if the number is negative
                    - if so increase count of negative numbers
                - print out highest, lowest, average, number of positive numbers and negative numbers
            - if the answer isn't valid
                - stop asking

Problem 4 (Course Grade Analysis - ***)

**Analysis:**

- This problem was a big learning problem to understand how to use information from a file. The way we read in the file was pretty much identical from one another.
- Problems I had at first was understanding how it would get the highest/lowest mark's name and how I understood it was it would read in all the information for each student and compare every aspect(ex. highest grade) each time and the variables would be updated so my thinking of searching a document like how humans do, I had friends help me understand it like a computer

computational thinking: processes involved in formulating a problem and expressing the solutions in such way a computer(human or machine) can effectively carry it out

1. **decomposition**
    - read in file
    - number of people who passed/failed
    - highest/lowest grade
    - highest/lowest name
    - final grade
2. **pattern recognition:** similarities among problems and data
    - studentinfo files haves the pattern of:
        - firs name, last name, assignment grade, midterm grade, exam grade
    - finding highest and lowest grades : can be found using similar steps
    - finding highest and lowest names: can be found using similar steps
3. **abstraction:** more general representation
    - necessary components/possible variables
        - passed/failed
        - highest/lowest grade
        - highest/lowest name
        - number of students and sum —> average
        - read in information about all students, manipulate those values to solve
4. **algorithm development:** produce unambiguous instructions (note: press the arrows to see all steps)
    - ask user to enter a file name
    - read in the file
    - while the next line isn't empty
        - for each student, read in first name, last name, and marks
        - calculate their final mark
        - if their final mark and exam mark are 50 or above
            - increase the passed counter
        - if they are below 50
            - increase the fail counter
        - if the student's final mark is greater than the highest mark
            - the highest mark is their final mark
            - their name is now the highest student's grade name
        - if the student's final mark is less than the lowest mark
            - the lowest mark is their final mark
            - their name is now the lowest student's grade name
        - calculate the average final scores
        - read in the next student's name
    - print out summary of grades
        - passed/failed
        - highest/lowest grade
        - highest/lowest name
        - number of students and sum —> average
    - close the file

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
