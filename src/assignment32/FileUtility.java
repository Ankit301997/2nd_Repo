package assignment32;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;



public class FileUtility {
public List<Player> readFileData(Reader outputStream)
throws IOException {
List<Player> players = new ArrayList<Player>();
BufferedReader bufferedReader = new BufferedReader(outputStream);
while(bufferedReader.ready()) {
String line = bufferedReader.readLine();
String[] tokens = line.split(",");
players.add(
new Player(
Integer.parseInt(tokens[0].trim()),
tokens[1].trim(),
tokens[2].trim(),
tokens[3].trim(),
Integer.parseInt(tokens[4].trim())
)
);



}
return players;
}

public void writeDataToFile(List<Player> playerList) throws FileNotFoundException, UnsupportedEncodingException {
PrintWriter writer = new PrintWriter("C:\\Users\\ANKITGHO\\OneDrive - Capgemini\\Desktop\\Assignment 4\\Assignemnt 4\\src\\assignment32\\output.csv", "UTF-8");

for (Player p: playerList) {
writer.println(p.toString());
}

writer.close();
}
}