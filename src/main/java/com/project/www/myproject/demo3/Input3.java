package com.project.www.myproject.demo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Input3 implements Observer{

    private ArrayList<String> lineTxt = new ArrayList<String>();
    public ArrayList<String> getLineTxt() {
        return lineTxt;
    }
    private Reader reader;

    public Input3(Reader reader) {
        this.reader = reader;
    }

    @Override
    public void toDo() {
        BufferedReader inputFile = new BufferedReader(reader);
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                lineTxt.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



