import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class NotaCsv {

    public List<Nota> read(String inputFile) throws IOException {
        List<Nota> list = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(Paths.get(inputFile))) {
            try (CSVParser csvParser = new CSVParser(reader,
                    CSVFormat.DEFAULT.
                            withFirstRecordAsHeader().
                            withIgnoreHeaderCase().
                            withTrim())) {
                for (CSVRecord csvRecord : csvParser) {
                    Nota n = new Nota();
                    n.setTitolo(csvRecord.get("titolo"));
                    n.setGruppo(csvRecord.get("gruppo"));
                    n.setTesto(csvRecord.get("testo"));
                    n.setAggiunta(csvRecord.get("aggiunta"));
                    n.setModifica(csvRecord.get("modifica"));
                    list.add(n);
                }
            }
        }
        return list;
    }

}
