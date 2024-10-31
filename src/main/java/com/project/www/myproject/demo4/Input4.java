package com.project.www.myproject.demo4;

import java.io.*;

public class Input4 extends Filter {
    private Reader reader;

    public Input4(Reader reader, Pipe output) {
        super(null, output);
        this.reader = reader;
    }

    @Override
    public void transform() throws IOException {
        BufferedReader inputFile = new BufferedReader(reader);
        String line;
        try {
            while ((line = inputFile.readLine()) != null) {
                output.writerLine(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        output.closeWriter();
    }

}
