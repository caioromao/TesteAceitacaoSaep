import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Utilitarios {
	public String converterInputStreamParaJson(InputStream content) throws IOException{
		StringBuilder json = new StringBuilder();
		String line;
		BufferedReader br = new BufferedReader(new InputStreamReader(content, "UTF-8"));
		
		while((line = br.readLine()) != null){
			json.append(line);
		}
		
		return json.toString();
	}
}
