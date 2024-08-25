package random;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ModifyFile {
    public static void main(String[] args) {
        // Path to the file on your desktop
        String desktopPath = System.getProperty("user.home") + "\\Desktop\\Leetcode Hello Interview.txt";

        // List to hold lines that do not start with a number
        List<String> filteredLines = new ArrayList<>();

        // Read the file and filter out lines starting with a number
        try (BufferedReader reader = new BufferedReader(new FileReader(desktopPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.matches("^\\d.*")) {  // Check if line does not start with a number
                    filteredLines.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Write the filtered lines back to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(desktopPath))) {
            for (String line : filteredLines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }

        System.out.println("File has been modified successfully.");
    }
}
