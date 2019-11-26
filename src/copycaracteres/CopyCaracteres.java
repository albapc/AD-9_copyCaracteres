package copycaracteres;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Alba
 */
public class CopyCaracteres {

    private static FileReader fr;
    private static FileWriter fw;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        fr = new FileReader("texto10.txt");
        fw = new FileWriter("texto11.txt");

        int c;

        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fw.close();
        fr.close();
    }

}
