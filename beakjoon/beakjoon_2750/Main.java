import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {
  public static void main(String[] args) throws Exception{
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		for(int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
  }
}
