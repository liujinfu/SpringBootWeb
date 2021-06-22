package com.cxytiandi.spring_boot_web.util;

import java.net.InetAddress;
import java.net.Socket;

public class NetUtils {
    public static boolean isLocalePortUsing(int port) {
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean isPortUsing(String host, int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress, port);
            socket.close();
            flag = true;
        } catch (Exception e) {

        }
        return false;
    }
}
