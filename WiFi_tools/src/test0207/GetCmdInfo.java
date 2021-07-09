package test0207;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sam
 */
public class GetCmdInfo {
    SimpleDateFormat df = new SimpleDateFormat("MM-dd HH:mm:ss");
    ArrayList<String> Listitem = new ArrayList<String>();
    public ArrayList<String> exec (String n) throws InterruptedException
    {   
        String ipconfig = n;
        String line = null;
            try
        {
            Process process = Runtime.getRuntime().exec(ipconfig);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            while ((line = reader.readLine()) != null)
            {
               /*jTextArea1.append(df.format(new Date())+"  "+line + "\n");*/
            }
            process.getOutputStream().close();
            System.out.println("程式執行完畢!");

            
        }
        catch (IOException ex)
        {
            Logger.getLogger(v2.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try 
        {  
            Process process = Runtime.getRuntime().exec(n);
            InputStream stderr = process.getErrorStream ();
            InputStreamReader esr = new InputStreamReader (stderr);
            BufferedReader ebr = new BufferedReader (esr);
            System.out.println ("<error>1");
            while ( (line = ebr.readLine ()) != null)
                System.out.println(line);
            System.out.println ("</error>2");
             
            InputStream stdout = process.getInputStream ();
            InputStreamReader osr = new InputStreamReader (stdout);
            BufferedReader obr = new BufferedReader (osr);
            System.out.println ("<output>");
            while ( (line = obr.readLine ()) != null)
                System.out.println(line);
            System.out.println ("</output>");
 
            int exitVal = process.waitFor ();
            System.out.println ("Process exitValue: " + exitVal);
            
        } 
        catch (IOException ex) 
        {
            Logger.getLogger(RuntimegetRuntime.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        */
        return Listitem;
    }
}
