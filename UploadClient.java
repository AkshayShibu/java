import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
 
public class UploadClient { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter file path to upload to server: "); 
        String filePath = scanner.nextLine(); 
        File file = new File(filePath); 
 
        if (!file.exists()) { 
            System.out.println("File does not exist."); 
            scanner.close(); 
            return; 
        } 
 
        try (Socket socket = new Socket("localhost", 8000)) { 
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream()); 
            dos.writeUTF(file.getName()); 
            dos.writeLong(file.length()); 
 
            FileInputStream fis = new FileInputStream(file); 
            byte[] buffer = new byte[4096]; 
            int bytesRead; 
            while ((bytesRead = fis.read(buffer)) != -1) { 
                dos.write(buffer, 0, bytesRead); 
            } 
            fis.close(); 
            System.out.println("File " + file.getName() + " uploaded successfully."); 
 
        } catch (IOException e) { 
            e.printStackTrace(); 
        } finally { 
            scanner.close(); 
        } 
    } 
} 
