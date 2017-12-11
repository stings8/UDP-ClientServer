package connection;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Veiculo;

public class ServerUDP {
	
	/**
	 *
	 * @Sting
	 * 
	 * */
	
	static List<Veiculo>veiculos = new ArrayList<>();

	public static void started() throws Exception {
		try {
			DatagramSocket aSocket = new DatagramSocket(1234);
			byte[] data = new byte[1024];
			System.out.println("Waiting...");
			while (true) {
				DatagramPacket packet = new DatagramPacket(data, data.length);
				aSocket.receive(packet);
				byte[] packetData = packet.getData();
				ByteArrayInputStream inputStream = new ByteArrayInputStream(packetData);
				ObjectInputStream objStream = new ObjectInputStream(inputStream);
				try {
					Veiculo veic = (Veiculo) objStream.readObject();
					veiculos.add(veic);
					System.out.println("Data Received");
					System.out.println(veic.toString());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		started();
	}

}
