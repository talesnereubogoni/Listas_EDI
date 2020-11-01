package Exemplo_EDI;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LoadCsvNovo {
	
	public static void main(String... args) {
        List<RecursosNovo> recursos = readDataFromCSV("202001_Transferencias.csv");

        // let's print all the person read from CSV file
        for (RecursosNovo b : recursos) {
            System.out.println(b);
        }
    }
	
	private static List<RecursosNovo> readDataFromCSV(String fileName) {
        List<RecursosNovo> dados = new ArrayList<>(); // cria uma lista
        Path pathToFile = Paths.get(fileName); // cria o caminho do arquivo

        // create an instance of BufferedReader
        // using try with resource, Java 7 feature to close resources
        try (BufferedReader br = Files.newBufferedReader(pathToFile,
        		Charset.forName("ISO-8859-1"))) {

            // read the first line from the text file
            String line = br.readLine();
            
            // descarta a 1a linha, usado quando tem cabeçalho
            if(line !=null) 
            	line = br.readLine();

            int quantidade_para_ler=10; // limitar a leitura de registros;
            int count = 0; // quatidade de registros lidos 
            // loop until all lines are read
            while (line != null) {
            	count++;
            	if(count > quantidade_para_ler) // limita a leitura dos registros
            		break;
                // use string.split to load a string array with the values from
                // each line of
                // the file, using a comma as the delimiter
                String[] attributes = line.split(";"); //separador

                RecursosNovo info = createInfo(attributes);

                // adding book into ArrayList
                dados.add(info);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }

        return dados;
    }

    private static RecursosNovo createInfo(String[] metadata) {
        // create and return book of this metadata
        return new RecursosNovo(metadata[0],
        					metadata[1],
        					metadata[2],
        					metadata[3],
        					metadata[4],
        					metadata[5],
        					metadata[8],
        					metadata[9],
        					metadata[10],
        					metadata[12],
        					metadata[13],
        					metadata[14],
        					metadata[15],
        					metadata[16],
        					metadata[23],
        					metadata[24],
        					metadata[25]);        				        
    }
    
}
