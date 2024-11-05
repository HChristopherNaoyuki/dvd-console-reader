// Package declaration
package Solution;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// ReadFromFile class to read DVD titles from a file
public class ReadFromFile
{
    // Method to read and display DVD titles from DVD.txt
    public void displayDVDTitles()
    {
        String filePath = "DVD.txt";
        String line;

        // Reading the file with exception handling
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            System.out.println("DVD Titles:");
            while ((line = reader.readLine()) != null)
            {
                System.out.println("- " + line);
            }
        }
        catch (IOException e)
        {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
