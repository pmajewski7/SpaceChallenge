package pl.ergohestia.dakt.spacechallenge;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class LoadFile {

        public ArrayList<Item> loadItems(String filePath) throws FileNotFoundException {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
            ArrayList<Item> items = new ArrayList<Item>();

            while (scanner.hasNextLine()){
                String[] item = scanner.nextLine().split("=");
                items.add(new Item(item[0], Integer.valueOf(item[1])));
            }
            System.out.println("No. of items: "+ items.size());
            return items;
        }
    }

}
