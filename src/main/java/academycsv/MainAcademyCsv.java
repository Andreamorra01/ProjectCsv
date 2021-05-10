package academycsv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class MainAcademyCsv {

        public static void main(String[] args) throws IOException, CsvException {
        String fileName = "/home/andreamorra/IdeaProjects/ProjectCsv/target/file.csv";
        CSVReader reader = new CSVReader(new FileReader(fileName));
        List<String[]> r = reader.readAll();

        for (String[] x: r) {
            //visualizza tutti gli elementi della lista
            System.out.println(Arrays.toString(x));
        }
        //visualizza solo l'elemento' alla posizione n della lista
        System.out.println(Arrays.toString(r.get(2)));
    }


}