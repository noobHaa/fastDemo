package com;

import org.csource.fastdfs.*;

/**
 * @Author ll
 * @Date 2018/11/7 10:41
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //1 获取配置文件
        ClientGlobal.init("D:\\workForIdea\\fastDemo\\src\\main\\resources\\fdfs_client.conf");

        //2创建客户端
        TrackerClient trackerClient = new TrackerClient();

        TrackerServer trackerServer = trackerClient.getConnection();
        //3获取存储服务器
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);


        String[] strings = storageClient.upload_file("D:\\yunpan\\banner4.jpg", "jpg", null);
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
