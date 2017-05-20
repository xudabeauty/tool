package com.xu;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

public class Practice {
    static Logger  logger=LoggerFactory.getLogger(Practice.class);
    public static void classRes(String filePath) throws IOException{
        String filePathString="F://huasuProject/deeplan2/Workspace/tool/src/main/resources/file.txt";
        //注意文件路径
        PathResource resource= new PathResource(filePathString);
         ClassPathResource classPathResource=new ClassPathResource(filePath);
        InputStream iStream= classPathResource.getInputStream();
        ByteArrayOutputStream ous=new ByteArrayOutputStream();
        int i;
        while((i=iStream.read())!=-1){
            ous.write(i);
        }
        System.out.println(ous.toString());
    }
    public static void main(String[] args) throws IOException  {
       // Practice.classRes("file.txt");
        logger.error("");
    }

}
