package JavaTestTCP.TestTCP01;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args)throws Exception {
        Socket client=new Socket("localhost",8888);
        String data="Hello";
//       DataOutputStream dom=new DataOutputStream(client.getOutputStream());
//        dom.writeUTF(data);
//        dom.flush();
        OutputStreamWriter osw=new OutputStreamWriter(client.getOutputStream());
        BufferedWriter bw=new BufferedWriter(osw);
        bw.write("sdtgsgsaghah");
        osw.close();
    }
}
