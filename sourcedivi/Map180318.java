package sourcedivi;
//�����ֽ�Hashmap
import java.io.*;
import java.util.*;
public class Map180318  {

    //private static Map<String, String> map = new HashMap<>();
    public static String FILE_PATH = "E:\\����ѵ��\\�û�����\\SMPCUP2017���ݼ�\\1_BlogContent.txt";
    private final static String OBJECT_FILE = "E:\\����ѵ��\\�û�����\\testwen\\�ֽ�Map\\BitMap1.txt";

public static void main(String [] args) throws Exception {
	 	FileInputStream inputStream = null;
	 	Scanner sc = null;
	 	inputStream = new FileInputStream(FILE_PATH);
		sc = new Scanner(inputStream);
	
	 	PrintWriter fw = null;
	 	fw = new PrintWriter(OBJECT_FILE);
       // if (map.size() == 0) {
            
                String line = null;
                long lineStart = 0;
                int numm = 0;
                while ( sc.hasNextLine()) {
                	line=sc.nextLine();
                	long lineEnd = lineStart + line.getBytes().length - 1;
                    //String[] split = line.split("");
                	fw.println(line.substring(0, 8)+"_"+String.valueOf(lineStart) + "_" + String.valueOf(lineEnd));
                    lineStart = lineEnd + 3;
                    //line = sc.nextLine();
                }
               /* 
        		Iterator ii = map.keySet().iterator();
      	      while (ii.hasNext()) {
      	        String word = ii.next().toString();
      	        String lline =map.get(word);
      	       fw.println(word+"_"+lline);*/
      	       
      	      //}
               
           // }
            sc.close();
            fw.close();
        
        }
}