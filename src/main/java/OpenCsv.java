
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OpenCsv {
    /**
     * questa classe visualizza un file Csv già esistente
     * @param args
     * @throws IOException
     * @throws CsvException
     */
    public static void main(String[] args) throws IOException, CsvException {

        String fileName = "/home/andreamorra/IdeaProjects/ProjectCsv/target/file.csv";
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
            r.forEach(x -> System.out.println(Arrays.toString(x)));
        }

    }

}
