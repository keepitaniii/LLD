import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String s;
    Map<String, Integer> transaction = new HashMap<>();
    int line = 0;
    while (!(s = in.nextLine()).isEmpty()) {
      if (line == 0) {
        line++;
        continue;
      }
      line++;

      String split[] = s.split(",");
      String key = split[0] + "," + split[2] + "," + split[1];
      int value = Integer.valueOf(split[3]);

      value += transaction.getOrDefault(key, 0);
      transaction.put(key, value);

//      s = in.nextLine();
//      System.out.println(s);
    }

    for (Map.Entry<String, Integer> entry : transaction.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
  }


//  id,card,date,amount
//  A,Visa,29-02-2000,500
//  B,MasterCard,29-02-2000,700

}
