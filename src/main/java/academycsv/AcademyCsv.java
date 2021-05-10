package academycsv;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *  Classe che legge un file csv e lo salva in una lista
 */
public class AcademyCsv {

    /** Il percorso del file **/
    private String percorsofile = "/home/andreamorra/IdeaProjects/ProjectCsv/target/file.csv";

    /** Nome del file csv **/
    private String fileName;

    /** Lista array dove verrà salvato il contenuto del csv **/
    protected List<String[]> list;

    /** Lettore del file **/
    FileReader fileReader;

    /** Accelera la lettura del file, leggendo un blocco (array) alla volta,
     *
     */
    BufferedReader bufferedReader;

    /** Dimensione del buff  **/
    protected int buffSize = 8000;

    /** Lettore del CSV che utilizza la classe Reader di Java **/
    CSVReader csvReader;



    private AcademyCsv() {

    }

    /**
     * Costruttore pubblico di AcademyCsv
     * che ha come parametri  fileReader, bufferedReader e csvReader
     * @param fileName il file csv
     * @throws FileNotFoundException se non trova il file
     */
    public AcademyCsv(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        fileReader = new FileReader(percorsofile + fileName);
        bufferedReader = new BufferedReader(fileReader, buffSize);
        csvReader = new CSVReader(bufferedReader);
    }

    /**
     * Metodo che legge il file CSV e lo salva in una lista
     * @throws IOException se non trova l'input
     * @throws CsvException se non trova il file csv
     */
    public void read() throws IOException, CsvException {
        list = csvReader.readAll();
    }

    /**
     * Metodo che ritorna il valore letto dal file CSV
     * @param i la posizione del valore nell'ArrayList
     * @return il valore in stringa
     */
    public String get(int i) {
        return Arrays.toString(list.get(i));
    }



}
