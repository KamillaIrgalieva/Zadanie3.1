package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Create {
    StringBuilder sb = new StringBuilder();

    void dir(String address, String name ) {
        File myFile = new File(address);
        if (myFile.mkdir()) {
            System.out.println("Каталог " + name + "  создан успешно");
            sb.append("Каталог "+ name + " создан успешно" + '\n');
        }
    }

    void file(String address,String name) {
        File mainFile = new File(address);
        try {
            if (mainFile.createNewFile())
                System.out.println("Файл " + name+ " создан успешно");
                sb.append("Файл " + name + " создан успешно" + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void write() {
        String text = sb.toString();
        try (FileWriter writer = new FileWriter("C://Games//temp//temp.txt")) {
            // запись всей строки
            writer.write(text);
            // запись по символам
            writer.append('\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}