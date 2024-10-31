package com.project.www.myproject.demo3;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;

public class Output3 implements Observer {
    private ArrayList<String> kwicList;
    private Writer writer;

    public Output3(ArrayList<String> kwicList, Writer writer) {
        this.kwicList = kwicList;
        this.writer = writer;
    }

    @Override
    public void toDo() {
        Iterator<String> it = kwicList.iterator();
        try {
            while (it.hasNext()) {
                writer.write(it.next() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public Writer getWriter() {
        return writer;
    }

}



