package com.project.www.myproject.demo2;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
public class Output2 {
    private ArrayList<String> kwicList;
    public Output2(ArrayList<String> kwicList) {
        this.kwicList = kwicList;
    }

    public void output(Writer writer) {
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
}
