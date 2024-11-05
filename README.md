# DVD Console Application

This Java console application reads and displays DVD information, demonstrating object-oriented principles like inheritance, abstract classes, and interfaces, as well as file handling with exception management. The project is organized in the `Solution` package and follows the Allman style for code formatting.

## Features

1. **DVD Details**: Displays details of DVDs using an abstract `DVD` class and `InstructionalDVD` subclass.
2. **File Reading**: Reads DVD titles from an external `DVD.txt` file, displaying each title and handling file read errors gracefully.

## Project Structure

The project consists of the following classes:

- **DVD (Abstract Class)**: Defines the base structure for a DVD with properties like title, release year, running time, and price, with an abstract method `setPrice`.
- **iPrintable (Interface)**: Declares a `ShowDetails()` method for displaying DVD details.
- **InstructionalDVD (Subclass)**: Extends `DVD` and implements `iPrintable`, adding a `category` attribute, and implementing `setPrice()` and `ShowDetails()`.
- **useDVD (Main Class)**: Creates and displays sample `InstructionalDVD` objects.
- **ReadFromFile**: Reads DVD titles from `DVD.txt` and displays them in the console, handling any file I/O errors.
- **useReadFromFile**: Demonstrates file reading by instantiating `ReadFromFile` and displaying titles.

## Installation and Setup

1. Clone this repository:
   ```bash
   git clone https://github.com/HChristopherNaoyuki/dvd-console-reader.git
   ```

2. Open the project in a Java IDE (such as IntelliJ IDEA or Eclipse).

3. Place a `DVD.txt` file in the project root with DVD titles, each on a new line:
   ```
   DVD Title 1
   DVD Title 2
   DVD Title 3
   ```

4. Build and run the project.

## Usage

1. **DVD Details**: Run `useDVD` to see DVD information displayed based on sample data.
2. **File Reading**: Run `useReadFromFile` to read and display DVD titles from `DVD.txt`. The program will handle any file errors, printing an error message if the file cannot be read.

## Example Output

### useDVD Output

```
Title: Learn Java
Year Released: 2021
Running Time: 120 mins
Category: Education
Price: $29.99

Title: Mastering AI
Year Released: 2022
Running Time: 150 mins
Category: Technology
Price: $39.99
```

### useReadFromFile Output (with sample `DVD.txt`)

```
DVD Titles:
- DVD Title 1
- DVD Title 2
- DVD Title 3
```

## Project Files

- `DVD.java`: Defines the abstract `DVD` class.
- `iPrintable.java`: Interface for displaying DVD details.
- `InstructionalDVD.java`: Implements additional properties and methods.
- `useDVD.java`: Main class to demonstrate DVD object creation.
- `ReadFromFile.java`: Reads DVD titles from a text file.
- `useReadFromFile.java`: Main class for file reading demonstration. 

---
