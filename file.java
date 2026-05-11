import java.io.*;

public class FileCopy {
    public static void main(String[] args) {

        // Mention source and destination files
        String sourceFile = "C:\\Users\\Student\\Desktop\\source.txt";
        String destinationFile = "C:\\Users\\Student\\Desktop\\copy.txt";

        try {
            FileInputStream fin = new FileInputStream(sourceFile);
            FileOutputStream fout = new FileOutputStream(destinationFile);

            int data;

            // Copy file content
            while ((data = fin.read()) != -1) {
                fout.write(data);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}