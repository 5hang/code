package com.qf.test;

import com.qf.utils.ESClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.Test;

public class Demo1 {

    @Test
    public void testConnect(){
        RestHighLevelClient client = ESClient.getClient();
        System.out.println("OK!!");
    }

}
