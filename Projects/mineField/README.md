# Project 1: MineField

## Objective
The objective of this project is to apply various programming concepts, including Object-oriented concepts, Lambda, Stream API, recursion, error handling, and unit tests. The project involves the creation of a MineField game.

## Packages and Naming
- Class and package naming:
  - Avoid repeated names and names from the language itself.
  - Package naming structure: Reverse order of the company's domain.
  - For our project (MineField):
    - Package structure: `com.SoftwareEngineering.EduardoNunes.MineField`

## Project Structure
- Divided into 3 layers (Based on MVC):
  - **Model**
    - Package to store project classes.
  - **View**
    - Package for the project interface (direct contact with the user).
  - **Exceptions**
    - Package to configure the project’s exceptions.

## JUnit Project Testing
- Use JUnit framework for testing.
- Tests located in the `tests` folder.

## Classes
### Model Layer
- **Fields**
  - Represents a field on the board.
  - Attributes:
    - Line: Field location line.
    - Column: Field location column.
    - Open: Indicates if the field has already been opened.
    - HaveBomb: Indicates if the field has a bomb.
    - Marked: Indicates whether the field is marked with a flag.
    - Neighbors: Set containing neighboring fields.
- **GameBoard**
  - Represents the game board.
  - Attributes:
    - Lines: Number of lines on the board.
    - Columns: Number of columns on the board.
    - AmountOfMines: Amount of mines on the board.
    - Fields: The fields on the board.

### View Layer
- **GameBoardConsole**
  - Represents the "graphical" part of the project.
  - Responsible for displaying the game on the console.

## Logic of Neighbors
- To be a neighbor of a field:
  - If the field is on the same row or in the same column:
    - Position difference must be 1.
      - `(current field column value - field column value) + (current field row value - field row value) = 1`
  - If the field is diagonal:
    - Position difference must be 2.
      - `(current field column value - field column value) + (current field row value - field row value) = 2`
    - How to identify if it is diagonal:
      - If the row and column are different from the current field.