package case_study.utils;

import case_study.model.Customer;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileCustomer {
    private static void writeFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void writeCustomerFile(String path, List<Customer> customerList) {
        StringBuilder data = new StringBuilder();
        for (Customer customer :customerList ) {
            data.append(customer.getInfo());
        }
        writeFile(path, data.toString());
    }
}
