public class StringBufferDemo { 
    public static void main(String[] args) { 
        StringBuffer sb = new StringBuffer("Hello"); 
        System.out.println("Initial StringBuffer: " + sb); 
        // 1. append() 
        sb.append(" World"); 
        System.out.println("After append: " + sb); 
        // 2. insert() 
        sb.insert(5, " Java"); 
        System.out.println("After insert: " + sb); 
        // 3. replace() 
        sb.replace(6, 10, "Python"); 
        System.out.println("After replace: " + sb); 
        // 4. delete() 
        sb.delete(6, 12); 
        System.out.println("After delete: " + sb); 
        // 5. reverse() 
        sb.reverse(); 
        System.out.println("After reverse: " + sb); 
        // 6. capacity() 
        System.out.println("Current capacity: " + sb.capacity()); 
        // 7. length() 
        System.out.println("Current length: " + sb.length()); 
    } 
}