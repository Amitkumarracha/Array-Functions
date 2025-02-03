# Array_and_ArrayList Repository

## **Project Overview**
This Java project provides various operations on arrays and ArrayLists, including:
- Separating even and odd numbers
- Finding the nearest neighboring numbers with the smallest difference
- Converting an array to an ArrayList and vice versa
- Interactive menu-based execution

## **Author Details**
- **Name:** Amitkumar Racha
- **PRN:** 24070126501
- **Batch:** A1 (2023-27)

## **Files and Their Functionality**

### **1. `Main.java`**
The main class executes the program and presents a **menu-based system** where the user can choose different functionalities.

#### **Functionality:**
- **Displays a menu** with options to perform different array operations.
- **Handles user input** and calls appropriate methods from other classes.
- Uses a **switch-case** structure for easy navigation.
- Ensures that the array is first initialized before performing operations.
- **Terminates execution** when the user selects the exit option.

### **2. `UserInput.java`**
This class handles the **input** of an array from the user.

#### **Methods:**
- `int[] arrayInput()`:
    - **Takes user input** for the number of elements.
    - **Validates input**, ensuring a positive size.
    - **Stores numbers** into an integer array and returns it.

### **3. `ArrayFunctions.java`**
Handles operations related to **even and odd number separation**.

#### **Methods:**
- `void separateEvenOdd(int[] array)`:
    - **Separates even and odd numbers** from the given array.
    - **Stores even numbers** in one list and odd numbers in another.
    - **Prints the separated lists**.
    - **Handles empty arrays gracefully**.

### **4. `MinDistanceFinder.java`**
Implements logic to find **two neighboring numbers** in an array with the **smallest difference**.

#### **Methods:**
- `int findMinDifference(int[] array)`:
    - **Finds the closest pair** in terms of absolute difference.
    - Returns the **index of the first number** in the closest pair.
    - Handles cases where the array has **less than two elements**.

### **5. `ArrayConverter.java`**
Handles conversion between **arrays and ArrayLists**.

#### **Methods:**
- `void convertArrayAndList(int[] array)`:
    - **Converts an array to an ArrayList** and prints the result.
    - **Converts an ArrayList back to an array** and prints the result.
    - Ensures **non-empty array validation**.

## **How to Run the Program**
1. **Compile all Java files** in IntelliJ IDEA or any Java-supported IDE.
2. Run `Main.java`.
3. Choose an option from the menu:
    - `1` → Enter array elements
    - `2` → Separate even and odd numbers
    - `3` → Find nearest neighbors with the smallest difference
    - `4` → Convert between Array and ArrayList
    - `5` → Exit the program

## **Example Output**
```
===== Menu =====
1. Enter Array Elements
2. Separate Even and Odd Numbers
3. Find Nearest Neighbors with Minimum Difference
4. Convert Array to ArrayList and Back
5. Exit
Enter your choice: 1
Enter the number of elements in the array: 5
Enter 5 numbers:
1 4 7 10 13
Array stored successfully!

===== Menu =====
Enter your choice: 2
Even Numbers: [4, 10]
Odd Numbers: [1, 7, 13]

===== Menu =====
Enter your choice: 3
Index of first number in pair: 0

===== Menu =====
Enter your choice: 4
Array converted to ArrayList: [1, 4, 7, 10, 13]
ArrayList converted back to Array: [1, 4, 7, 10, 13]
```
How to Run:

Clone this repository: git clone https://github.com/Amitkumarracha/Array_and_ArrayList.git

Navigate to the project folder: cd Array_and_ArrayList

Compile the Java files: javac Main.java

Run the program: java Main

Follow On-Screen Instructions Choose operations from the menu. Provide required input when prompted. View results in the console output.

---
**This Assignment demonstrates various fundamental Java operations using arrays and ArrayLists with an interactive menu-driven approach.** 🚀

