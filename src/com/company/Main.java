package com.company;

public class Main {

    public static void main(String[] args) {

        Create create = new Create();
        create.dir("C://Games", "Games");
        create.dir("C://Games//src","src");
        create.dir("C://Games//res", "res");
        create.dir("C://Games//savegames", "savegames");
        create.dir("C://Games//temp","temp");
        create.dir("C://Games//src//main","main");
        create.dir("C://Games//src//main","test");
        create.file("C://Games//src//main//Main.java", "Main.java");
        create.file("C://Games//src//main//Utils.java", "Utils.java");
        create.dir("C://Games//res//drawables", "drawables");
        create.dir("C://Games//res//vectors", "vectors");
        create.dir("C://Games//res//vectors//icons", "icons");
        create.file("C://Games//temp//temp.txt", "temp.txt");

        create.write();

        GameProgress obj1 = new GameProgress(10, 5, 1, 100.1);
        GameProgress obj2 = new GameProgress(11, 6, 2, 200.5);
        GameProgress obj3 = new GameProgress(12, 7, 3, 300.5);

        Savegames savegames = new Savegames();
        savegames.saveGame("C://Games//savegames//save1.dat", obj1);
        savegames.saveGame("C://Games//savegames//save2.dat", obj2);
        savegames.saveGame("C://Games//savegames//save3.dat", obj3);

        Zipfiles zipfiles = new Zipfiles();
        zipfiles.Zip("C://Games//savegames//save1.zip", "C://Games//savegames//save1.dat", "save1.dat");
        zipfiles.Zip("C://Games//savegames//save2.zip", "C://Games//savegames//save2.dat", "save2.dat");
        zipfiles.Zip("C://Games//savegames//save3.zip", "C://Games//savegames//save3.dat", "save3.dat");


    }

}