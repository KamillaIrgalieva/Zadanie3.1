package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Savegames {

    public void saveGame(String name, GameProgress obj){
        // откроем выходной поток для записи в файл
        try (FileOutputStream fos = new FileOutputStream(name);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // запишем экземпляр класса в файл
            oos.writeObject(obj);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
