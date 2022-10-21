package FILEIO;

import java.io.*;

public class SerializableApp {
    void serialize(User user)
    {
        try{
            File file = new File("C:/Users/vkams/Documents/sep-22/2909/"+user.name+".txt");
            FileOutputStream stream = new FileOutputStream(file);
            ObjectOutputStream ObjStream = new ObjectOutputStream(stream);
            ObjStream.writeObject(user);
            ObjStream.close();
            stream.close();
            System.out.println("User data saved for user::"+user.name);
        }catch (Exception e)
        {
            System.err.println("Something went wrong ...! "+e);
        }
    }

    void deserialize(User user)
    {
       try{
           File file = new File("C:/Users/vkams/Documents/sep-22/2909/"+user.name+".txt");
           if(file.exists())
           {
               FileInputStream stream = new FileInputStream(file);
               ObjectInputStream ObjInputStream = new ObjectInputStream(stream);
               User userOb = (User)ObjInputStream.readObject();
               System.out.println(userOb);
           }else {
               System.out.println("File does not exits...");
           }
       }catch (Exception e)
       {
           System.out.println("Something went wrong..."+e);
       }
    }
    public static void main(String[] args) {
           User user = new User("mohoroy","mohoroy@amazon.com",25,"female",5.0);
           SerializableApp s = new SerializableApp();
           s.serialize(user);
           s.deserialize(user);
    }
}
