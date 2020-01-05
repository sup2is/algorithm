package beakjoon_1068;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	private static Node[] nodes;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		nodes = new Node[n];

		for (int i = 0; i < n; i++) {
			Node node = new Node(i);
			nodes[i] = node;
		}

		for (int i = 0; i < n; i++) {
			int parentId = Integer.parseInt(st.nextToken());
			nodes[i].parentId = parentId;
			if (parentId >= 0) {
				nodes[parentId].children.add(nodes[i]);
			}
		}

		int removeId = Integer.parseInt(br.readLine());

		Node target = nodes[removeId];
		remove(target);
		nodes[target.id] = null;

		if(target.parentId >= 0) {
			nodes[target.parentId].children.remove(target);
		}

		int cnt = 0;
		for (int i = 0; i < nodes.length; i++) {
			if (nodes[i] != null && nodes[i].children.size() == 0) {
				cnt++;
			}
		}

		System.out.println(cnt);

	}

	private static void remove(Node target) {
		for (Node n : target.children) {
			if(n.children.size() >= 0) {
				remove(n);
			}
			nodes[n.id] = null;
		}
	}
}

class Node {

	int id;
	int parentId;
	List<Node> children = new ArrayList<>();

	public Node(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Node [id=" + id + ", parentId=" + parentId + ", children=" + children + "]";
	}

}
