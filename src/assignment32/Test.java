package assignment32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class Test {
public static void main(String[] args)throws IOException {

InputStream stream = new FileInputStream("C:\\Users\\ANKITGHO\\OneDrive - Capgemini\\Desktop\\Assignment 4\\Assignemnt 4\\src\\assignment32\\input.txt");
FileUtility uf = new FileUtility();
List<Player> players = new ArrayList<Player>();
try {

players = uf.readFileData(new InputStreamReader(stream));

Collections.sort(players, new Comparator<Player>() {
@Override
public int compare(Player p1, Player p2) {
return p1.compareTo(p2);
}
});

uf.writeDataToFile(players);

} catch(FileNotFoundException e) {
System.out.println("File not found");
} catch(IOException e) {
System.out.println(e);
}
}
}