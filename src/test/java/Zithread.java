import java.io.*;
import java.net.Socket;

/**
 * 守护线程子线程
 */
public class Zithread implements Runnable {

    private BufferedReader reader;

    private Socket socket;

    public Zithread(Socket clientSocket) {
        try {
            // 得到socket连接
            socket = clientSocket;
            //得到客户端发来的消息
            InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
            reader = new BufferedReader(isReader);
            //发送指令
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            String info = "[3G*4700546714*0005*VERNO]";
            pw.write(info);

            pw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void run() {

        String message;
        try
        {

            while ((message = reader.readLine()) != null)
            {
                System.out.println("客户端消息: " + message);
            }
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
