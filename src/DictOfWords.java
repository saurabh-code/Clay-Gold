import java.io.*;
import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class DictOfWords {
	
	public static HashMap<String, Boolean> readAndMap(String address) throws Exception{
		File file = new File(address);
    BufferedReader br = new BufferedReader(new FileReader(file));

    HashMap<String, Boolean> dictMap = new HashMap<>();
    Boolean flag = false;

    String currWord;
    while ((currWord = br.readLine()) != null){
      dictMap.put(currWord, flag);
      //System.out.println(currWord);
    }
    br.close();
    return dictMap;
	}
	
	public static void main(String[] args) throws Exception {
		String address = "src/Files/sowPods.txt";
		HashMap<String, Boolean> dictMap = new HashMap<>();
		dictMap = readAndMap(address);
	}
}
