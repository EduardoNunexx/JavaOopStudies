Project 1 minefield
The objective of the project is to use the concepts seen so far (Object-oriented concepts, Lambda, streamApi, recursion, error handling, unit tests, etc...)

-Packages and naming
• About class and package naming
• You should as much as possible avoid using repeated names and names that are from the language itself
• Generally the package naming structure is the name of the company's domain with the order reversed
    • In the case of Microsoft creating Windows Windos.microsoft.com
    • Com.Microsoft.Windows
    • Always placing the current project at the end
•  In the case of our project (mineField)
    • com.Software Engineering.EduardoNunes.mineField

-About project structure
• We will divide our project into 3 layers (Based on mvc)
    • Model
        ■ Package where we will store the project classes
    。View
        ■ Package where we will store the project interface (part that will have direct contact with the user)
    • Exceptions
        ■ Package where we will configure the project’s exceptions

-About Junit project testing
    • We will use JUnit
    • JUnit is a framework for applying tests to Java projects
    • The application tests were located in the tests folder

-About our classes
    • In the models layer we will have the classes
        • Fields
            ■ Class that represents a field on the board
            ■With attributes
                ⚫Line->field location line
                ⚫Column→ field location column
                ⚫ Open→ if the field has already been opened
                ⚫haveBomb→ if the field has a bomb
                ⚫marked→ whether the field is marked or not (with the flag)
                ⚫neighbors → a set that contains neighboring fields
        • GameBoard
            ■ Class that represents the game board
            ■ With attributes
                ⚫lines → number of lines on the board
                ⚫ column→ number of columns on the board
                ⚫amountOfMines→ amount of mines on the board
                ⚫fields → the fields on the board
    •In the view layer we will have the class   
        • GameBoardConsole
            ■ Class that represents the "graphical" part of the project
            ■ She will be responsible for showing the game on the console
-About the logic of neighbors
    • To be a neighbor of a field:
    • If the field is on the same row or in the same column
        ■ The position difference must be 1
            ⚫(current field column value -field column value) + (current field row value -field row value) = 1
    • If the field is diagonal
        ■ The position difference must be
        ■ (current field column value -field column value) + (current field row value -field row value) = 2
        ■How do you know if it is diagonal?
            -If the row and column are different from the current field
