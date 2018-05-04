package com.owant.page;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class SortKeyTest {
    SortKey sortKey;

    @Test
    public void main() {
        sortKey = new SortKey("E:\\Saft\\app\\Commons\\translations",
                "E:\\Saft\\app\\ModuleEntry\\nutritionScale_esn00.js",
                "E:\\IdeaProjects\\PageKeyWord\\src\\main\\java\\com\\owant\\page");
    }


    @Test
    public void getAllImport() {
        main();

        try {
            sortKey.noLooperImport.clear();
            sortKey.getAllImport("E:\\Saft\\app\\Module\\air_purifier_132\\Components\\DeviceHome.js");
            for (String item : sortKey.noLooperImport) {
                System.out.println(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void patternKey() {
    }
}