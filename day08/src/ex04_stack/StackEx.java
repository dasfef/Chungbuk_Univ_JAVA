package ex04_stack;

import java.util.Scanner;

public class StackEx {
	static int top = 0;
	static int[] arr = new int[5];
	static Scanner scan = new Scanner(System.in);
	
	public static void push(int k) {
		if (top == 5)
			System.out.println("스택이 꽉 찼습니다");
		else
			arr[top++] = k;
	}
	
	public static int pop() {
		if (top == 0)
			return -1;
		else 
			return arr[--top];
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.print("1.push 2.pop 3.Exit >> ");
			int n = scan.nextInt();
			
			if (n == 1) {
				System.out.print("삽입할 값 입력 >> ");
				int m = scan.nextInt();
				push(m);
			}
			else if (n == 2) {
				int val = pop();
				
				if (val == -1)
					System.out.println("스택이 비어있습니다.");
				else
					System.out.println("pop value: " + val);
			}
			else if (n == 3) {
				break;
			}
		}
	}
}
