package com.weibo.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileutil {
        public void saveFile(byte[] compressed) {
            // 确定写出文件的位置
            File file = new File("../edit.txt");
            // 建立输出字节流
            FileOutputStream fos = null;
            try {
                fos = new FileOutputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            // 用FileOutputStream 的write方法写入字节数组
            try {
                fos.write(compressed);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("保存成功");
            // 为了节省IO流的开销，需要关闭
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
}
