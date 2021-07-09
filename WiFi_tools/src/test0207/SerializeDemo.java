package test0207;

import java.io.*;
public class SerializeDemo {
    public SerializeDemo()
   {
      try
      {
         FileOutputStream fileOut =
         new FileOutputStream("testDemo.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(_SerializerData.class);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in test.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
