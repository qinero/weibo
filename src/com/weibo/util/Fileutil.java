package com.weibo.util;

import java.io.*;

public class Fileutil {
        // 当前用户发表的微博个数
        static int shu = 1;
        //提交文字小于10字
        public void saveString(String content,Object user){
            // 设置创建用户文件夹的路径
            String path = "E:\\微博开发项目\\weibo\\file\\";
            String fileName = path+user;
            String filenameTemp;
            // 创建文件夹
            File file=new File(fileName);
            //异常处理
            try{
                //如果文件夹不存在
                if(!file.exists()){
                    //创建文件夹
                    file.mkdir();
                }
                // 获取文件夹路径
                path=file.getPath();
                // 设置将要创建文件的路径
                filenameTemp=path+"\\"+ shu +".txt";
                shu++;
                //创建该文件
                BufferedWriter bw=new BufferedWriter(new FileWriter(filenameTemp));
                // 将文本写入文件
                bw.write(content);
                // 关闭文件
                bw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        //提交文字大于10字压缩后二进制存
        public void saveFile(byte[] compressed,Object user) {
            FileOutputStream fop = null;
            // 设置文件夹路径
            String path = "E:\\微博开发项目\\weibo\\file\\";
            String fileName = path+user;
            String filenameTemp;
            // 创建文件夹
            File file=new File(fileName);
            //异常处理
            try {
                //如果文件夹不存在
                if(!file.exists()){
                    //创建文件夹
                    file.mkdir();
                }
                // 获取文件夹路径
                path=file.getPath();
                // 设置文件名
                filenameTemp=path+"\\"+ shu +".txt";
                // 微博数加1
                shu++;
                //创建该文件
                File filee = new File(filenameTemp);
                fop = new FileOutputStream(filee);
                // 写入文件
                fop.write(compressed);
                fop.flush();
                fop.close();
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

    public void saveHead(byte[] compressed,Object user) {
        FileOutputStream fop = null;
        // 设置文件夹路径
        String path = "E:\\微博开发项目\\weibo\\file\\";
        String fileName = path+user;
        String filenameTemp;
        // 创建文件夹
        File file=new File(fileName);
        //异常处理
        try {
            //如果文件夹不存在
            if(!file.exists()){
                //创建文件夹
                file.mkdir();
            }
            // 获取文件夹路径
            path=file.getPath();
            // 设置文件名
            filenameTemp=path+"\\"+".img";
            //创建该文件
            File filee = new File(filenameTemp);
            fop = new FileOutputStream(filee);
            // 写入文件
            fop.write(compressed);
            fop.flush();
            fop.close();
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
