import java.util.ArrayList;
import java.util.List;
import java.util.LinkedHashMap;

public class ChangeMaker {
  public static String makeChange(int cents) {
    // LinkedHashMap<Integer, String> coinMap = new LinkedHashMap<Integer, String>();
    // coinMap.put(25, "quarter(s)");
    // coinMap.put(10, "dime(s)");
    //coinMap.put(5, "nickel(s)");
    //coinMap.put(1, "pennie(s)");

    String[] coinNames = {"quarter(s)", "dime(s)", "nickel(s)", "pennie(s)"};
    Integer[] coinValues = {25, 10, 5, 1};
    Integer[] coinNumber = {1, 3, 4, -1};

    ArrayList<String> changeStringArray = new ArrayList<String>();
    for (int currentCoin = 0; currentCoin < coinNames.length; currentCoin++) {
      int coinCount = 0;
      while ((coinCount+1) * coinValues[currentCoin] <= cents && coinNumber[currentCoin] != 0) {
        coinNumber[currentCoin] -= 1;
        coinCount++;
      }
      if (coinCount != 0) {
        String changeString = Integer.toString(coinCount) + " " + coinNames[currentCoin];
        cents -= coinCount * coinValues[currentCoin];
        changeStringArray.add(changeString);
      }
    }

    //parse all coins into string
    String finalString = "";
    for (int index = 0; index < changeStringArray.size(); index++) {
      finalString = finalString.concat(changeStringArray.get(index));
      if (index != changeStringArray.size()-1) {
        finalString = finalString.concat(" ");
      }
    }
    return finalString;
  }
}
