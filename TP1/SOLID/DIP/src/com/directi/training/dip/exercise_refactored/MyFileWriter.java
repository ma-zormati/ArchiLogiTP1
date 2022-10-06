package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements WriterInterface{
    private String _fileName;

    public MyFileWriter(String fileName)
    {
        _fileName = fileName;
    }

    public void write(String ch) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName));
        writer.write(ch);
        writer.close();
    }
}
