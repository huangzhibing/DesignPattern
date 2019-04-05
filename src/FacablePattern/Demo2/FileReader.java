package FacablePattern.Demo2;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {
    public String read(String fileName){
        System.out.println("读取文件，获取明文：");
        FileInputStream inputStream = null;
        StringBuilder stringBuilder = new StringBuilder();  //stringbuffer其实是动态字符串数组

        try{
            inputStream = new FileInputStream(fileName);
            int data;
            while ((data = inputStream.read())!=-1){

            }
        }catch (FileNotFoundException e){
            System.out.println("文件不存在！");
        }catch (IOException e){
            System.out.println("文件操作错误！");
        }
        return inputStream.toString();
    }
}
