import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 守护线程
 */
public class StartThread extends Thread {

    public void run() {
        int GPSport = 7700;
        System.out.println("---------GPSport:" + GPSport);

        try {

            ServerSocket serverSocket = new ServerSocket(GPSport);

            //轮流等待请求
            while (true) {

            //等待客户端请求,无请求,闲置,有请求,返回请求socket连接
                Socket clientSocket = serverSocket.accept();//阻塞

             // 创建zithread对象,通过socket连接通信
                Thread t = new Thread(new Zithread(clientSocket));



                t.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
