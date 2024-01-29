/* Напишите метод, который вернет содержимое текущей папки в виде 
массива строк. 
Напишите метод, который запишет массив, возвращенный предыдущим 
методом в файл. 
Обработайте ошибки с помощью try-catch конструкции. В случае 
возникновения исключения, оно должно записаться в лог-файл. */

package Seminar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Sem2_005 {
    static private Logger logger = Logger.getLogger(Sem2_005.class.getName());

    static String[] getCurrentFolderContent() {
        String path = System.getProperty("user.dir");
        File dir = new File(path);
        return dir.list();
    }

    static void writeArrToFile(String[] dataArr, String fileName) {
        try (FileWriter fw = new FileWriter(fileName)) {
            for (String str : dataArr) {
                fw.write(str);
                fw.append(System.lineSeparator());
            }
            fw.flush();
            logger.info("Data saved!");
        } catch (IOException e) {
            logger.warning(e.getMessage());
            // logger.log(Level.WARNING, e.getMessage());
        }       
    }

    private static void configLogger() throws IOException {
        logger.setLevel(Level.ALL);
        FileHandler fh = new FileHandler("log.txt", true);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);
        logger.addHandler(fh);
    }

    public static void main(String[] args) throws SecurityException, IOException {
        configLogger();

        String[] folderContent = getCurrentFolderContent();
        writeArrToFile(folderContent, "data.txt");
    }
}
