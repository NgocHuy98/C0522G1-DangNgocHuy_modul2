package ss17_binary_file_serialization.exercise.system_product.utils;

import ss17_binary_file_serialization.exercise.system_product.model.Product;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Product> readFile(String path){
        List<Product> productList = new ArrayList<>();
        try{
            FileInputStream file = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(file);
            productList = (List<Product>) ois.readObject();
            file.close();
            ois.close();
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return productList;
    }

}

