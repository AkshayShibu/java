import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
 
public class CServer { 
    public static void main(String[] args) { 
        try (ServerSocket serverSocket = new ServerSocket(1000)) { 
            System.out.println("Chat Server started on port 1000..."); 
            Socket socket = serverSocket.accept(); 
            System.out.println("Client joined."); 
 
            DataInputStream in = new DataInputStream(socket.getInputStream()); 
            DataOutputStream out = new DataOutputStream(socket.getOutputStream()); 
            Scanner scanner = new Scanner(System.in); 
 
            String receiveMsg, sendMsg; 
            while (true) { 
                receiveMsg = in.readUTF(); 
                if (receiveMsg != null) { 
                    if (receiveMsg.equalsIgnoreCase("bye")) { 
                        System.out.println("Client left the chat."); 
                        break; 
                    } 
                    System.out.println("Client: " + receiveMsg); 
                } 
 
                System.out.print("Server: "); 
                sendMsg = scanner.nextLine(); 
                out.writeUTF(sendMsg); 
                if (sendMsg.equalsIgnoreCase("bye")) break; 
            } 
            socket.close(); 
            scanner.close(); 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 