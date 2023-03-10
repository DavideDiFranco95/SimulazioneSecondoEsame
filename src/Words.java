import javax.swing.*;
import java.io.*;
import java.util.*;

public class Words {

    public Map<Character,List<String>> inizialiParole(String fileIn,String fileOut)throws IOException{

        FileReader fr= new FileReader(fileIn);
        BufferedReader br=new BufferedReader(fr);
        Map<Character,List<String>> fileInResult = new TreeMap<>();
        String riga;
        while ((riga= br.readLine()) != null){
            riga = riga.replaceAll("[^a-zA-Z0-9\\s]", " ").trim();
            String[] parole = riga.split("\\s+");
            for (String parola : parole){
                char iniziale = parola.charAt(0);
                if (iniziale == parola.indexOf(iniziale, 0)){
                    List<String> oldValue = fileInResult.get(iniziale);
                    oldValue.add(parola);
                    fileInResult.put(iniziale, Collections.singletonList(parola));
                }else{
                    List<String> oldValue = new ArrayList<>();
                    oldValue.add(parola);
                }
            }
        }

        try (
                FileWriter fw= new FileWriter(fileOut);
                ){
            fw.write(fileOut);

        }catch (Exception e){
            e.printStackTrace();
        }
        return fileInResult;
    }
}