import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {
        String text =
            "Peter Piper picked a peck of pickled peppers. "
            + "A peck of pickled peppers Peter Piper picked. "
            + "If Peter Piper picked a peck of pickled peppers, "
            + "where is the peck of pickled peppers Peter Piper picked?";

        try {
            // Write the text into a file.
            FileWriter writer = new FileWriter("sample.txt");
            writer.write(text);
            writer.close();

            System.out.println("Data written to sample.txt");

            // Read the file.
            File file = new File("sample.txt");
            Scanner reader = new Scanner(file);

            StringBuilder content = new StringBuilder();

            while (reader.hasNextLine()) {
                content.append(reader.nextLine()).append(" ");
            }

            reader.close();

            // Convert text to lowercase.
            String data = content.toString().toLowerCase();

            int peCount = 0;
            int piCount = 0;

            // Count occurrences of pe and pi.
            for (int i = 0; i < data.length() - 1; i++) {
                String pair = data.substring(i, i + 2);

                if (pair.equals("pe")) {
                    peCount++;
                }

                if (pair.equals("pi")) {
                    piCount++;
                }
            }

            System.out.println("Occurrences of pe: " + peCount);
            System.out.println("Occurrences of pi: " + piCount);

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}