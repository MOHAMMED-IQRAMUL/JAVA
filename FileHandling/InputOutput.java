package FileHandling;

import java.io.*;

public class InputOutput {

    public static void SwapFileContent() throws Exception {

        String Data1 = "";
        String Data2 = "";
        int temp = 0;
        FileReader fileReader1 = new FileReader("FileHandling" + File.separator + "File1.txt");

        while ((temp = fileReader1.read()) != -1)
            Data1 += (char)temp;
        fileReader1.close();
        FileReader fileReader2 = new FileReader("FileHandling" + File.separator + "File2.txt");
        while ((temp = fileReader2.read()) != -1)
            Data2 += (char)temp;
        fileReader2.close();

        FileWriter fileWriter1 = new FileWriter("FileHandling" + File.separator + "File1.txt");
        fileWriter1.write(Data2);
        fileWriter1.close();
        FileWriter fileWriter2 = new FileWriter("FileHandling" + File.separator + "File2.txt");
        fileWriter2.write(Data1);
        fileWriter2.close();
    }

    public static void main(String[] args)throws Exception {
        SwapFileContent();
    }

}
