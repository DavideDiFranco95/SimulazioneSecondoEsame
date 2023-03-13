import java.io.*;
import java.util.*;

public class Words_two {
    public void inizialiParole(String fileIn,String fileOut)throws IOException {
        FileReader fr= new FileReader(fileIn);
        BufferedReader br=new BufferedReader(fr);
        Map<Character, Set<String>> map = new TreeMap<>();
        String riga;
        while ((riga = br.readLine())!= null){
            riga = riga.replaceAll("[^a-zA-Z0-9\\s]"," ").trim();
            String[] parole = riga.split("\\s+");
            for (String parola:parole){
                char iniziale = parola.charAt(0);
                Set<String> set = map.computeIfAbsent(iniziale, k -> new HashSet<>());
                set.add(parola);
            }
        }
        System.out.println(map);
        FileWriter fw = new FileWriter(fileOut);
        map.forEach((key, value)->{
            try {
                fw.write(key+ " [ " + value + " ] \n");
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        });
        fw.flush();
        fw.close();
    }
}
