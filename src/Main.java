import java.io.*;

public class Main {
    public static void main(String[] args){
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try{
            dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(
                                    new File("sdz.txt"))));

            dos.writeBoolean(true);
            dos.writeByte(100);
            dos.writeChar('C');
            dos.writeDouble(12.05);
            dos.writeFloat(100.52f);
            dos.writeInt(1024);
            dos.writeLong(1234567890L);
            dos.writeShort(2);
            dos.close();

            dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(
                                    new File("sdz.txt"))));

            System.out.println(dis.readBoolean());
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());
            System.out.println(dis.readFloat());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readShort());

        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            }
            catch(IOException e){
                e.printStackTrace();
            }

            try{
                if(dos != null){
                    dos.close();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
