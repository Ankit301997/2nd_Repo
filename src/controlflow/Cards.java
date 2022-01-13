package controlflow;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Cards {

	public static void main(String[] args) {
		String[] cardsType ={"c","s","h","d"};
		String [] cardValue = {"A","2","3","4","5","6","7","8","9","10","K", "Q", "J" };
		List<String> cards = new ArrayList<String>();
		for(int i=0;i<=(cardsType.length)-1;i++){
		for(int j=0;j<=(cardValue.length)-1;j++){
		cards.add(cardValue[j] + cardsType[i]);
		}
		}
		Collections.shuffle(cards);
		List<String> a1 = new ArrayList<>();
		List<String> a2 = new ArrayList<>();
		List<String> a3 = new ArrayList<>();
		List<String> a4 = new ArrayList<>();
		for (int i=0; i< 13; i++){
		int rand = (int)(Math.random() * cards.size());
		a1.add(cards.get(rand));
		cards.remove(rand);
		rand = (int)(Math.random() * cards.size()) ;
		a2.add(cards.get(rand));
		cards.remove(rand);
		rand = (int)(Math.random() * cards.size()) ;
		a3.add(cards.get(rand));
		cards.remove(rand);
		rand = (int)(Math.random() * cards.size()) ;
		a4.add(cards.get(rand));
		cards.remove(rand);
		}
		System.out.print("player #1: ");
		for (int i=0; i< 13; i++){
		System.out.print(a1.get(i) + " ");
		}
		System.out.println();
		System.out.print("player #2: ");
		for (int i=0; i< 13; i++){
		System.out.print(a2.get(i) + " ");
		}
		System.out.println();
		System.out.print("player #3: ");
		for (int i=0; i< 13; i++){
		System.out.print(a3.get(i) + " ");
		}
		System.out.println();
		System.out.print("player #4: ");
		for (int i=0; i< 13; i++){
		System.out.print(a4.get(i) + " ");
		}
		System.out.println();
		
		

	}

}
