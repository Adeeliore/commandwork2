package informatics1.lab14.src.main.java.ru.itis.lab14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class FileWorker {
    private String str;
    public String fileReader(String fileName) {

        try {
            str = new String(Files.readString(Path.of(fileName)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return str;

    }

}
