package connection;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;


import model.Veiculo;

/**
 *
 * @author sting
 */
public class ClientUDP {
    
    public static boolean sendObject(Veiculo veic){
        try{
        		//cria socket
            DatagramSocket aSocket = new DatagramSocket();
            //pega o ip local
            InetAddress getIp = InetAddress.getByName("localhost");
            //transforma um objto em array de bytes
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream objStream = new ObjectOutputStream(outputStream);
            objStream.writeObject(veic);
            byte[] data = outputStream.toByteArray();
            //monta o pacote com data(array de bytes), tamanho do array, ip, porta)
            DatagramPacket packet = new DatagramPacket(data, data.length, getIp, 1234);
            //envia pacote
            aSocket.send(packet);
            return true;
        } catch (SocketException e) {
            System.out.println(e.getMessage());
            return false;
        } catch (UnknownHostException e) {
        		System.out.println(e.getMessage());
            return false;
        } catch (IOException e) {
        		System.out.println(e.getMessage());
            return false;
        } catch (Exception e){
        		System.out.println(e.getMessage());
            return false;
        }
    }
    
}
