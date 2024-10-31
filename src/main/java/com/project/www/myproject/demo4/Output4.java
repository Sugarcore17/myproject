package com.project.www.myproject.demo4;

import java.io.*;

public class Output4 extends Filter {
    private Writer writer;
    public Output4(Pipe input, Writer writer) {
        super(input, null);
        this.writer = writer;
    }
    @Override
    public void transform() throws IOException {
        String line;
        try {
            while (input.hashNextLine()) {
                writer.write(input.readerLine() + "\n");
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
        input.closeReader();
    }

}
