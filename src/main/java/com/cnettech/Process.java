package com.cnettech;

import com.cnettech.util.Log4j;

public class Process extends Thread{
    private boolean running;

    public Process() {
        Log4j.log.info("---2 File Delete Process START ----");
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            try {

            } catch (Exception e) {
                Log4j.log.error("---2 Error Occur" + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
