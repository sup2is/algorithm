import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		Map<String, Book> map = new HashMap<>();

		String bookName;
		while (n --> 0) {
			bookName = br.readLine();
			Book book;
			if(map.containsKey(bookName)){
				book = map.get(bookName);
				book.count ++;
			}else {
				book = new Book();
				book.count = 1;
				book.name = bookName;
			}
			map.put(bookName, book);
		}

		Comparator<Book> comparator = Comparator.comparing(Book::getCount);

		List<Book> books = new LinkedList<Book>(map.values());
		int max = books.stream()
				.max(comparator)
				.get()
				.count;

		List<String> bestBooks = books.stream()
				.filter(b -> b.count == max)
				.map(b -> b.name.toString())
				.collect(Collectors.toList());

		PriorityQueue<String> pq = new PriorityQueue<String>(bestBooks);

		System.out.println(pq.poll());

	}
}

class Book {
	String name;
	int count;

	public int getCount() {
		return count;
	}
}