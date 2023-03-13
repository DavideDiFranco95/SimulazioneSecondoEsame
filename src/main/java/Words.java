import java.io.*;
import java.util.*;

public class Words {

    public void inizialiParole(String fileIn,String fileOut)throws IOException{

        try {
            FileReader fr= new FileReader(fileIn);
            BufferedReader br=new BufferedReader(fr);
            Map<Character,List<String>> fileInResult = new TreeMap<>();
            String riga;
            while ((riga= br.readLine()) != null){
                riga = riga.replaceAll("[^a-zA-Z0-9\\s]", " ").trim();
                String[] parole = riga.split("\\s+");
                for (String parola : parole){
                    char iniziale = parola.charAt(0);
                    if (iniziale == parola.indexOf(iniziale)){
                        List<String> oldValue = fileInResult.get(iniziale);
                        oldValue.add(parola);
                        fileInResult.put(iniziale, Collections.singletonList(parola));
                        continue;
                    }else{
                        List<String> oldValue = new ArrayList<>();
                        oldValue.add(parola);
                        fileInResult.put(iniziale,oldValue);
                    }
                }
            }
            System.out.println(fileInResult);
            FileWriter fw = new FileWriter(fileOut);
            fileInResult.forEach((key, value)->{
                try {
                    fw.write(key+ " [ " + value + " ] \n");
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            });
            fw.flush();
            fw.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}