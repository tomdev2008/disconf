package com.baidu.disconf.core.test.restful;

import java.util.List;

import com.google.common.collect.Lists;

/*
 * 
 * 远程MOck测试服务器的一些常量
 */
public class RemoteMockServer {

    // 远程PORT
    public static final Integer PORT = 9289;

    // 远程URL
    public static final List<String> LOCAL_HOST_LIST = Lists
            .newArrayList("127.0.0.1:" + String.valueOf(PORT));

    //
    // 配置文件
    //
    public static final String FILE_URL = "/api/config/file?app=disconf_testcase&env=rd&type=0&key=confA.properties&version=1_0_0_0";
    public static final String FILE_NAME = "confA.properties";
    public static final String FILE_CONTENT = "confa.varA=1000\r\nconfa.varA2=2000";

    //
    // 空配置文件
    //
    public static final String EMPTY_FILE_URL = "/api/config/file?app=disconf_testcase&env=rd&type=0&key=empty.properties&version=1_0_0_0";
    public static final String EMPTY_FILE_NAME = "empty.properties";

    //
    // 静态配置文件
    //
    public static final String STATIC_FILE_URL = "/api/config/file?app=disconf_testcase&env=rd&type=0&key=staticConf.properties&version=1_0_0_0";
    public static final String STATIC_FILE_NAME = "staticConf.properties";
    public static final String STATIC_FILE_CONTENT = "staticvar=50\r\nstaticvar2=100";

    //
    // 配置项
    //
    public static final String ITEM_URL = "/api/config/item?app=disconf_testcase&env=rd&type=1&key=keyA&version=1_0_0_0";
    public static final String CONTENT_TYPE = "application/json";
    public static final String DEFAULT_ITEM_VALUE = "1000";

    //
    public static final String LOCAL_DOWNLOAD_DIR = "./disconf/download";

    //
    // zoo
    //
    public static final String ZOO_URL = "/api/zoo/hosts";
    public static final String ZOO_HOSTS = "127.0.0.1:8581,127.0.0.1:8582,127.0.0.1:8583";
    public static final String ZOO_PREFIX_URL = "/api/zoo/prefix";
    public static final String ZOO_PREFIX_VALUE = "/disconf";
}
