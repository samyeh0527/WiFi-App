package test0207;

import java.io.*;

public class _SerializerData  implements java.io.Serializable{
  
    private String IP= null;
    private String IP1= null;
    private String IP2= null;
    private String IP3= null;
    
    public _SerializerData( String IP, String IP1,String IP2,String IP3) {
        
        this.IP= IP;
        this.IP1 = IP1;
        this.IP2 = IP2;
        this.IP2 = IP3;
    }

    public String GetIP(){
        return this.IP;
    }
    public String GetIP1(){
        return this.IP1;
    }
    public String GetIP2(){
        return this.IP2;
    }
    public String GetIP3(){
        return this.IP3;
    }
   

    
    
 }
