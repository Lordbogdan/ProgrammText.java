
import java.io.*;
import java.util.*;

public class ProgrammText2 {

    public static void main(String[] args) throws IOException {

        BufferedReader readerFile = new BufferedReader(new FileReader
                ("/Users/b.marchenko/Desktop/Java/SpeedLog.txt"));

        ArrayList<Double> list = new ArrayList<>();

        while (readerFile.ready()) {
            double num = Double.parseDouble(readerFile.readLine());
            list.add(num);
        }
        Collections.sort(list);
        for (double number : list) {
            if (number % 1 == 0) {

                System.out.println((int) number);
            } else {
                System.out.println(number);
            }
        }
        readerFile.close();

        File myDir = new File("MyDirectory");
        myDir.mkdir();

        String path = myDir.getAbsolutePath();
        System.out.println(path);
        File file = new File(path + "/Files.txt");
        file.getParentFile().mkdir();
        file.createNewFile();

        PrintWriter pw = new PrintWriter(file);
        pw.println(list);
        pw.close();
    }


}