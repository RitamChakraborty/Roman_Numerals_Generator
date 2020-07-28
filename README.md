# Roman Numerals Generator

This is a command line app written in *Java* which converts numbers between 1 and 3999 to **Roman Numerals**.

## Roman Numerals
| Number | Roman |
| ------ | ----- |
| 1 | I |
| 5 | V |
| 10 | X |
| 50 | L |
| 100 | C |
| 500 | D |
| 1000 | M |

## How it works?
- First It breaks down the number into its 10th power digit
- Like 123 = [100, 20, 3]
- The base is 10 to the power of the (digit of the number - 1)
- For 100 -> 100, 20 -> 10, 3 -> 1
- Then it checks each number if it's less than 4th or is 4th or is 5th or less than 9th or 9th multiple of base
    - If less than 4, adds multiple of base to the list
        - 300 -> [100, 100, 100]
    - If 4, add base and 5 * base
        - 400 -> (500 - 100) -> [100, 500]
    - If 5, adds 5 * base
        - 500 -> [500]
    - If less than 9, add 5 * base and multiple how much the number is greater than 5 * base
        - 800 -> (500 + 300) -> [500, 100, 100, 100]
    - If 9, add the base and base * 10
        - 900 -> (1000 - 100) -> [100, 900]
- At last, map the list element with data stores in a *HashMap*
- The list is a *Double Ended Queue* and numbers adds at first of the list

## Demo 
    Enter number (less than 3999): 
    49
    49 in roman numeral is: XLIX
    Enter '0' to exit.
    Enter number (less than 3999): 
    3888
    3888 in roman numeral is: MMMDCCCLXXXVIII
    Enter '0' to exit.
    Enter number (less than 3999): 
    0
    Enter '0' to exit.