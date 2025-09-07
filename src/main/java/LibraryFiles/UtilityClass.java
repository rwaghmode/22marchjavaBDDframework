package LibraryFiles;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UtilityClass {


    public static String getPFData(String key) throws IOException {
        try (FileInputStream file = new FileInputStream("\\Users\\Admin\\IdeaProjects\\Cucumber_BDD_Framework\\src\\main\\java\\LibraryFiles\\PropertyFile.properties"))
        {
            Properties p = new Properties();
            p.load(file);

            return p.getProperty(key);

        }
    }
}
