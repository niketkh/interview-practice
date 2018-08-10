import java.io.*;

class Singleton implements Serializable
{
    public static Singleton instance;
    public int i = 10;
     
    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null)
            instance = new Singleton();

        return instance;
    }

    public Object readResolve() {
        return instance;
    }
     
}

class Main {
    public static void main(String args[]) throws Exception {
        try {
            Singleton instance1 = Singleton.getInstance();
            ObjectOutput out 
                = new ObjectOutputStream(new FileOutputStream("file.text"));
            out.writeObject(instance1);
            out.close();
            instance1.i = 20;

            ObjectInput in 
                = new ObjectInputStream(new FileInputStream("file.text"));
            Singleton instance2 = (Singleton) in.readObject();
            in.close();

            System.out.println(instance2.i);
         
            System.out.println("instance1 hashCode:- "
                                           + instance1.hashCode());
            System.out.println("instance2 hashCode:- "
                                           + instance2.hashCode());
        }
        finally {

        }
    }
}