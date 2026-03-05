import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
 
public class CClient { 
    public static void main(String[] args) { 
        try (Socket socket = new Socket("localhost", 1000)) { 
            DataInputStream in = new DataInputStream(socket.getInputStream()); 
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); 
            Scanner scanner = new Scanner(System.in); 
            String receiveMsg, sendMsg; 
            while (true) { 
                System.out.print("Client: "); 
                sendMsg = scanner.nextLine(); 
                out.writeUTF(sendMsg); 
                if (sendMsg.equalsIgnoreCase("bye")) break; 
                receiveMsg = in.readUTF(); 
                if (receiveMsg != null) { 
                    if (receiveMsg.equalsIgnoreCase("bye")) { 
                        System.out.println("Server ended the chat."); 
                        break; 
                    } 
                    System.out.println("Server: " + receiveMsg); 
                } 
            } 
            scanner.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 