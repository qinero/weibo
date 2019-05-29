package com.weibo.util;

import java.io.*;

public class Fileutil {
        static int shu = 1;
        //提交文字小于10字
        public void saveString(String content,Object user){
            String path = "E:\\微博开发项目\\weibo\\file\\";
            String fileName = path+user;
            String filenameTemp; //= path+fileName+"\\"+shu+".txt";//名称+文件类型

            File file=new File(fileName);

            try{//异常处理
                if(!file.exists()){//如果文件夹不存在
                    file.mkdir();//创建文件夹
                }
                path=file.getPath();
                filenameTemp=path+"\\"+ shu +".txt";
                shu++;
                //创建该文件
                BufferedWriter bw=new BufferedWriter(new FileWriter(filenameTemp));
                bw.write(content);//在创建好的文件中写入
                bw.close();//一定要关闭文件
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        //提交文字大于10字压缩后二进制存
        public void saveFile(byte[] compressed,Object user) {
            FileOutputStream fop = null;
            String path = "E:\\微博开发项目\\weibo\\file\\";

            String fileName = path+user;
            String filenameTemp;

            File file=new File(fileName);

            try {
                if(!file.exists()){//如果文件夹不存在
                    file.mkdir();//创建文件夹
                }
                path=file.getPath();
                filenameTemp=path+"\\"+ shu +".txt";
                shu++;
                //创建该文件
                File filee = new File(filenameTemp);
                fop = new FileOutputStream(filee);

                fop.write(compressed);
                fop.flush();
                fop.close();

                System.out.println("正确了");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fop != null) {
                        fop.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
}
