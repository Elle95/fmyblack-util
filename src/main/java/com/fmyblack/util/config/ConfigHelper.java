package com.fmyblack.util.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigHelper {

    private static Map<String, Properties> confMap = new HashMap<String, Properties>();
    
    public static void init(String file_path) {
        File dir = new File(file_path);
        if(dir.isDirectory()) {
            for(File f : dir.listFiles()) {
                init_conf(f);
            }
        }
    }
    
    private static void init(File dir) {
        if(dir.isDirectory()) {
            for(File f : dir.listFiles()) {
                init_conf(f);
            }
        }
    }
    
    private static void init_conf(File f) {
        if(f.isDirectory()) {
            init(f);
        } 
        Properties prop = new Properties();
        try {
            FileInputStream in = new FileInputStream(f);
            prop.load(in);
            f.getName();
            System.out.println(f.getName());
            confMap.put(f.getName(), prop);
            in.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public static String getConf(String conf, String key) {
        return getConf(conf, "properties", key);
    }
    
    public static String getConf(String conf, String suffix, String key) {
        String file = conf + "." + suffix;
        return confMap.get(file).getProperty(key);
    }
    
    public static void main(String[] args) {
        init("D:\\java\\work\\ItemProfile\\src\\main\\resources\\config");
        System.out.println(getConf("jdbc", "jdbc.url"));
//        init();
//        System.out.println(System.getProperty("discovery.zen.ping.unicast.hosts"));
    }
}
