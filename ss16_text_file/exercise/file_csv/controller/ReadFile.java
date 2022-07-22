package ss16_text_file.exercise.file_csv.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadFile {
    public static void main(String[] args) {
        BufferedReader read = null;
        try {
            String line;
            read = new BufferedReader(new FileReader("ss16_text_file/exercise/file_csv/view/read.csv"));

            while ((line = read.readLine()) != null) {
                displayNation(convertFile(line));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (read != null)
                    read.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> convertFile(String file) {
        List<String> fileList = new ArrayList<>();
        if (file != null) {
            String[] splitData = file.split(",");
            fileList.addAll(Arrays.asList(splitData));
        }
        return fileList;
    }

    private static void displayNation(List<String> nation) {
        System.out.println(
                "Nation: id = "
                        + nation.get(0)
                        + ", code = " + nation.get(1)
                        + ", name = " + nation.get(2));
    }

}