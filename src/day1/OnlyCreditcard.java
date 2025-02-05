package day1;

import java.util.ArrayList;

public class OnlyCreditcard {

	public static void main(String[] args) {
		
		ArrayList<String> ccList=new ArrayList<String>();
		ccList.add("4522-4444-1234-2456");
		ccList.add("4444-5555-6666-7777-9999");
		ccList.add("9999-8888-7777-66ab");
		ccList.add("1234-4567-5678-6789");
		ccList.add("1234-3456-567812");
		System.out.println(filterCreditCardNumber(ccList));
		//["4522-4444-1234-2456",1234-4567-5678-6789]
		



	}
	
	public static ArrayList<String> filterCreditCardNumber(ArrayList<String> lt){
		ArrayList<String> validCards = new ArrayList<>();
  String regex = "^(\\d{4}-){3}\\d{4}$";  // Match format like 4522-4444-1234-2456 (16 digits with dashes)
        
        for (String card : lt) {
            // If the card matches the regex pattern
            if (card.matches(regex)) {
                validCards.add(card);
	
		
	}

}
        return validCards;
	}
}
