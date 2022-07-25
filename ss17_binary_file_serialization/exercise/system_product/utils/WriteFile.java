package ss17_binary_file_serialization.exercise.system_product.utils;


import ss17_binary_file_serialization.exercise.system_product.model.Product;


import java.io.*;
import java.util.List;


public class WriteFile {
    public static void writeFile(String path, List<Product> productList) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

   }
