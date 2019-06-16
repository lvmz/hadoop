/**
 * 服务器监听类
 */
public class VideoandGPS {

    public void contextInitialized() {
        //gps守护线程
        StartThread startThread = new StartThread();
        //设置线程为后台线程,tomcat不会被hold,启动后依然一直监听。
//        startThread.setDaemon(true);
        startThread.start();
        System.out.println("---------GPS监听已启动------");

    }



}
