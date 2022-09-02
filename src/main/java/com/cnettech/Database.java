package com.cnettech;

import com.cnettech.util.Log4j;
import com.cnettech.util.SqlSessionFactoryManager;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class Database {

    private SqlSession sqlSession = null;

    public void tbl_dash_Monitoring_update(String system_code, String cpu, String mem, String hdd, String process,
                                           String alarm) {
        // SqlSession sqlSession = null;
        Map<String, Object> argMap = new HashMap<String, Object>();

        try {
            // DB Connection
            if (sqlSession == null)
                sqlSession = SqlSessionFactoryManager.getSqlSessionFactory().openSession(true);
            argMap.clear();
            argMap.put("system_code", system_code);
            argMap.put("cpu", cpu);
            argMap.put("mem", mem);
            argMap.put("hdd", hdd);
            argMap.put("process", process);
            argMap.put("alarm", alarm);

            int count = sqlSession.update("dashboard.tbl_dash_Monitoring_update", argMap);

            Log4j.log.info("readChannel : " + count);

        } catch (Exception e) {
            Log4j.log.error(e.getMessage());
        } finally {
            // if (sqlSession != null)
            // sqlSession.close();
        }
    }
}
