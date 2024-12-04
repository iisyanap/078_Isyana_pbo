package Structural_Composite;

public class Main {
    public static void main(String[] args) {
        // Create Files
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File file3 = new File("file3.jpg");

        // Create Directories
        Directory directory1 = new Directory("Documents");
        Directory directory2 = new Directory("Images");

        // Add Files to Directories
        directory1.add(file1);
        directory1.add(file2);
        directory2.add(file3);

        // Create root directory and add subdirectories
        Directory rootDirectory = new Directory("Root");
        rootDirectory.add(directory1);
        rootDirectory.add(directory2);

        // Show details of the entire file system
        rootDirectory.showDetails();
    }
}
