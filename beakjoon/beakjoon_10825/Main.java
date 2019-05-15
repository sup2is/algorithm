package beakjoon_10825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	private static void merge(Student[] students) {
		Student[] temp = new Student[students.length];
		mergeSort(students, temp, 0, students.length-1);
	}
	
	private static void mergeSort(Student[] arr, Student[] temp, int start, int end) {
		if(start < end) {
			int mid = (start+end) / 2;
			mergeSort(arr, temp, start, mid);
			mergeSort(arr, temp, mid+1, end);
			merge(arr,temp,start,mid,end);
		}
	}

	private static void merge(Student[] arr, Student[] temp, int start, int mid, int end) {
		
		for (int i = start; i <= end; i++) {
			temp[i] = arr[i];
		}

		int part1 = start;
		int part2 = mid+1;
		int index = start;
		
		while(part1 <= mid && part2 <= end) {
			if(temp[part1].getKorean() > temp[part2].getKorean()) {
				arr[index] = temp[part1];
				part1 ++;
			}else if(temp[part1].getKorean() < temp[part2].getKorean()){
				arr[index] = temp[part2];
				part2 ++;
			}else {
				//국어점수가 같을 때
				if(temp[part1].getEnglish() < temp[part2].getEnglish()) {
					arr[index] = temp[part1];
					part1 ++;
				}else if (temp[part1].getEnglish() > temp[part2].getEnglish()) {
					arr[index] = temp[part2];
					part2 ++;
				}else {
					//국어 + 영어점수가 같을 때
					if(temp[part1].getMath() > temp[part2].getMath()) {
						arr[index] = temp[part1];
						part1 ++;
					}else if (temp[part1].getMath() < temp[part2].getMath()) {
						arr[index] = temp[part2];
						part2 ++;
					}else {
						//국어 + 영어 + 수학 점수가 같을 때
						char a[] = temp[part1].getName().toCharArray();
						char b[] = temp[part2].getName().toCharArray();
						
						int n = a.length < b.length ? a.length : b.length;
						
						for (int i = 0; i < n; i++) {
							if(a[i] == b[i]) {
								continue;
							}
							
							if(a[i] < b[i]) {
								arr[index] = temp[part1];
								part1 ++;
								break;
							}else {
								arr[index] = temp[part2];
								part2 ++;
								break;
							}
						}
					}
				}
			}
			index ++;
		}
		
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = temp[part1 + i];
		}
		
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		
		Student[] students = new Student[n];
		String s[];
		for (int i = 0; i < n; i++) {
			s = br.readLine().split(" ");
			students[i] = (new Student(s[0], Integer.parseInt(s[1]), Integer.parseInt(s[2]), Integer.parseInt(s[3])));
		}
		merge(students);
		
		for (Student stdnt : students) {
			sb.append(stdnt.getName() + "\n");
		}

		System.out.println(sb.toString());
		
	}
	
}

class Student {
	
	private String name;
	private int korean;
	private int english;
	private int math;
	
	public Student(String name, int korean, int english, int math) {
		super();
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + "]";
	}
	
}
