package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        File myFile = new File("C://Games");
        if(myFile.mkdir()) {
            System.out.println("Каталог Games создан успешно");
            sb.append("Каталог Games создан успешно" + '\n');
        }

        File myFile1 = new File("C://Games", "src");
        if(myFile1.mkdir()) {
            System.out.println("Директория src создана успешно");
            sb.append("Директория src создана успешно" + '\n');
        }

        File myFile2 = new File("C://Games", "res");
        if(myFile2.mkdir()) {
            System.out.println("Директория res созданa успешно");
            sb.append("Директория res созданa успешно" + '\n');
        }

        File myFile3 = new File("C://Games", "savegames");
        if(myFile3.mkdir()) {
            System.out.println("Директория savegames созданa успешно");
            sb.append("Директория savegames созданa успешно" + '\n');
        }

        File myFile4 = new File("C://Games", "temp");
        if(myFile4.mkdir()) {
            System.out.println("Директория temp созданa успешно");
            sb.append("Директория temp созданa успешно" + '\n');
        }

        File srcFile = new File("C://Games//src", "main");
        if(srcFile.mkdir()) {
            System.out.println("Директория main создана успешно");
            sb.append("Директория main создана успешно" + '\n');
        }

        File srcFile1 = new File("C://Games//src", "test");
        if(srcFile1.mkdir()) {
            System.out.println("Директория test создана успешно");
            sb.append("Директория test создана успешно" + '\n');
        }

        File mainFile = new File("C://Games//src//main", "Main.java");
        try {
            if(mainFile.createNewFile())
                System.out.println("Файл Main.java создан успешно");
                sb.append("Файл Main.java создан успешно" + '\n');
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        File mainFile2 = new File("C://Games//src//main", "Utils.java");
        try {
            if(mainFile2.createNewFile())
                System.out.println("Файл Util.java создан успешно");
                sb.append("Файл Util.java создан успешно" + '\n');
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        File resFile = new File("C://Games//res", "drawables");
        if(resFile.mkdir()) {
            System.out.println("Директория drawables создана успешно");
            sb.append("Директория drawables создана успешно" + '\n');
        }

        File resFile1 = new File("C://Games//res", "vectors");
        if(resFile1.mkdir()) {
            System.out.println("Директория vectors создана успешно");
            sb.append("Директория vectors создана успешно" + '\n');
        }

        File resFile2 = new File("C://Games//res", "icons");
        if(resFile2.mkdir()) {
            System.out.println("Директория icons создана успешно");
            sb.append("Директория icons создана успешно" + '\n');
        }

        File tempFile = new File("C://Games//temp", "temp.txt");
        try {
            if(tempFile.createNewFile())
                System.out.println("Файл temp.txt создан успешно");
                sb.append("Файл temp.txt создан успешно" + '\n');
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }

        String text = sb.toString();
        try(FileWriter writer = new FileWriter("C://Games//temp//temp.txt")) {
            // запись всей строки
            writer.write(text);
            // запись по символам
            writer.append('\n');
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
