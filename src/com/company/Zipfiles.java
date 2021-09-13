package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipfiles {
    public void Zip(String zipName,String file, String newFile) {

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream(zipName));
             FileInputStream fis = new FileInputStream(file)) {
            ZipEntry entry = new ZipEntry(newFile);
            zout.putNextEntry(entry);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
