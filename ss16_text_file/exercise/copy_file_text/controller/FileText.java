package ss16_text_file.exercise.copy_file_text.controller;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileText {
    public static List<String> readFile(String path) {
        List<String> list = new ArrayList<>();
        File file = new File(path);
        FileReader fileReader;
        BufferedReader bufferedReader;
        String line;
        int sum = 0;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                sum += line.length();
                list.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("So ki tu: " + sum);
        return list;
    }

    public static void writeFile(String path, List<String> list) {
        File file = new File(path);
        FileWriter fileWriter;
        BufferedWriter bufferedWriter;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String item : list) {
                bufferedWriter.write(item);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String sourcePath = "ss16_text_file/exercise/copy_file_text/source.csv";
        String targetPath = "ss16_text_file/exercise/copy_file_text/tailieu.csv";
        FileText.writeFile(targetPath, FileText.readFile(sourcePath));
    }

}
