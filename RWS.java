class SM{
    int data;boolean f=false;
    public synchronized void put(int a){
        try{
            if(f==true)
                wait();
            data=a;
            System.out.println("Put:"+data);
            f=true;
            notify();
        }catch(Exception e){}
    }

    public synchronized void get(){
        try{
            if(f==false)
                wait();
            System.out.println("Get:"+data);
            f=false;
            notify();
        }catch(Exception e){}
    }
}

class Writer extends Thread{
    SM q;
    public Writer(SM q){
        this.q=q;
    }
    public void run(){
        int i=1;
        while(true){
            q.put(i);
            i++;
        }
    }
}

class Reader extends Thread{
    SM q;
    public Reader(SM q){
        this.q=q;
    }
    public void run(){
        int i;
        while(true){
            q.get();
        }
    }
}

class RWS{
    public static void main(String args[]){
        SM q=new SM();
        Writer p=new Writer(q);
        Reader c=new Reader(q);
        p.start();
        c.start();
    }
}