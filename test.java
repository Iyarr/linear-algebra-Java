
import java.util.*;
public class test {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		map.put("リンゴ",80);
		map.put("オレンジ",120);
		map.put("ブドウ",90);
		int num = map.get("オレンジ");
		System.out.println(num); // 120
		System.out.println(map.get("メロン")); // null
	}
}