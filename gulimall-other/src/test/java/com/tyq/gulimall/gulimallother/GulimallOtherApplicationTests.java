package com.tyq.gulimall.gulimallother;


import com.aliyun.oss.OSSClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
@RunWith(SpringRunner.class)
public class GulimallOtherApplicationTests {

    @Autowired
    private OSSClient ossClient;

    @Test
    public void upload () throws FileNotFoundException {

        // 填写Bucket名称，例如examplebucket。
        String bucketName = "gulimall-tyq";
        String objectName = "mysql.txt";
        String filePath= "C:\\Users\\tangyuqun\\Desktop\\mysql.txt";

        // 创建OSSClient实例。
        InputStream inputStream = new FileInputStream(filePath);
        // 创建PutObject请求。
        ossClient.putObject(bucketName, objectName, inputStream);
        ossClient.shutdown();
    }

}
