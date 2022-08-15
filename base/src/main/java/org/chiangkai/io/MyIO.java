package org.chiangkai.io;

import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;

/**
 * @author ChiangKai
 * @date 2022/8/15 14:36
 */
public class MyIO {
    @SneakyThrows
    public void WriteFile(){
        try(FileWriter fileWriter = new FileWriter(new File("1.txt"))){
            fileWriter.write("hello world\nhello world");
        }catch (Exception exception){
            exception.printStackTrace();
        }


    }

    /**
     * 转换流
     */
    @SneakyThrows
    public void transStream(){
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("1.txt")))) {
            while (true) {
                int read = inputStreamReader.read();
                if (!(read !=-1)) {
                    break;
                }
                System.out.print((char)read);
            }

        }
    }
}

