package com.cxytiandi.spring_boot_web.util;

import java.util.Random;

/**
 * 端口工具类
 * @author jason
 */
public class ServerPortUtils {
    /**获取可用端口，范围2000-6535**/
    public static int getAvailablePort() {
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max)%(max-min+1) + min;
        boolean using = NetUtils.isLocalePortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }
}
