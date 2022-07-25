package ss17_binary_file_serialization.exercise.copy_file.controller;

import ss17_binary_file_serialization.exercise.copy_file.model.CopyFile;

import java.io.File;
import java.io.IOException;

public class Binary {

    public static void main(String[] args) {
        Binary.display();
    }

    public static void display() {
        String sourcePath = "ss17_binary_file_serialization/exercise/copy_file/source.txt";
        String targetPath = "ss17_binary_file_serialization/exercise/copy_file/taget.txt";
        try {
            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);
            if (targetFile.exists()) {
                throw new FileExistsException("File da ton tai!");
            }
            CopyFile.copyFileBinary(sourceFile, targetFile);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
