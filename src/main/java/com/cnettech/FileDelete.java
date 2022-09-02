package com.cnettech;

import java.net.SocketException;
import java.util.Properties;

import com.cnettech.util.Common;
import com.cnettech.util.Log4j;

public class FileDelete {
    public static void main(String[] args) {
        Log4j.log.info("---- Program START ----");
        try {
            final Properties pros = Common.getProperties();
            
            // 파일 삭제용 Thread 실행
            Log4j.log.info("---1 File Delete Thread Call ");
            Process serverRec = new Process();
            serverRec.start();
        } catch (Exception e) {
            Log4j.log.error("---1 Error Occur" + e.getMessage());
            e.printStackTrace();
        }
    }

}
