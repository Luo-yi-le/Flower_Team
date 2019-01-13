package com.nf511.flower_team.util.Log4jUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Logging {

    //一个日志对象
    Logger logger;

    private String info;
    private String error;
    private String debug;
    private String warn;
    private String trace;

    public Logging(){
        //初始化日志对象
        logger=LogManager.getLogger(Logging.class);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        logger.info(info);
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        logger.error(error);
    }

    public String getDebug() {
        return debug;
    }

    public void setDebug(String debug) {
        logger.debug(debug);
    }

    public String getWarn() {
        return warn;
    }

    public void setWarn(String warn) {
        logger.warn(warn);
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        logger.trace(trace);
    }
}