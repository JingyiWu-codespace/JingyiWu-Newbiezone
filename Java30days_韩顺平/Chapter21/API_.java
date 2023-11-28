package Java30days_韩顺平.Chapter21;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取本机的InetAddress
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
        //2. 根据指定的主机名，获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("JennideMacBook-Pro.local");
        System.out.println(host1);
        //3. 根据域名返回InetAddress对象，比如www.google.com
        InetAddress host2 = InetAddress.getByName("www.google.com");
        System.out.println(host2);
        //4. 通过InetAddress对象，获取对应的地址
        System.out.println(host2.getHostAddress());
        //5. 通过InetAddress对象，获取对应的主机名/或者是域名
        System.out.println(host2.getHostName());
    }
}
