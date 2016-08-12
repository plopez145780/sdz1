import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.io.BufferedInputStream;
import java.io.DataInputStream;

public class Main {
    public static void main(String[] args){
        FileInputStream fis = null;
        BufferedInputStream bis = null;

        try{
            fis = new FileInputStream(new File("test.txt"));
            bis = new BufferedInputStream(
                    new FileInputStream(
                            new File("test.txt")
                    )
            );

            byte[] buf = new byte[8];
            long startTime = System.currentTimeMillis();
            while(fis.read(buf) != -1);
            System.out.println("Temps de lecture avec FileInputStream : " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            while(bis.read(buf) != -1);
            System.out.println("Temps de lecture avec BufferedInputStream : " + (System.currentTimeMillis() - startTime));
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

            try{
                if(bis != null){
                    bis.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
