
/*
 * Thema:
 */
import java.util.*;

class Queue {
	String QUEUE[][];
	int ROWcount;
	int COLUMNcount=0;

	public void CreateQueue() {
		ArrayList<ArrayList<String>> queue = new ArrayList<ArrayList<String>>();
		String roupe = "CONTINUE";
		int ColumnCount = 0;
		int RowCount;

		for (RowCount = 0; roupe != "END"; RowCount++) {
			Scanner in = new Scanner(System.in);
			String input = in.next();
			ArrayList<String> row  = new ArrayList<>(Arrays.asList(input.split(" ")));
			if( row.size() == 0 ) {
				roupe = "END";
				continue;
			}
			ColumnCount = input.length() - input.replaceAll(" ", "").length() + 1;
			queue.add(row);
			in.close();
			if(this.COLUMNcount  < ColumnCount) {
				this.COLUMNcount = ColumnCount;
			}
		}
		

		this.ROWcount = RowCount;
		this.QUEUE = queue.toArray(new String[ROWcount][COLUMNcount]);
	}
}

public class Index {
	public static void main(String[] args) {
		Queue former = new Queue();
		former.CreateQueue();
		System.out.println(former.QUEUE);

	}
}
