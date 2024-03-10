package FileHandling;

import java.io.*;

public class FileInputOutputStream {
    public static void main(String[] args) throws Exception {
        {
            FileInputStream FIS = new FileInputStream("FileHandling" + File.separator + "InputOutput.txt");
            byte[] b = new byte[FIS.available()];
            String Data = "";
            FIS.read(b);
            for (byte bb : b)
                Data += (char) bb;
            System.out.println("EXISTING DATA " + Data);
            FIS.close();

        }
        {
            FileOutputStream FOS = new FileOutputStream("FileHandling" + File.separator + "InputOutput.txt");
            String Data = "New Data Update";
            FOS.write(Data.getBytes());
            FOS.close();
        }
        {
            FileInputStream FIS = new FileInputStream("FileHandling" + File.separator + "InputOutput.txt");
            byte[] b = new byte[FIS.available()];
            String Data = "";
            FIS.read(b);
            for (byte bb : b)
                Data += (char) bb;
            System.out.println("UPDATED DATA " + Data);
            FIS.close();

        }

    }
}
