import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int height;
		do{
		System.out.println("Enter a height within 0 and 23");
		height = s.nextInt();
		} while (height < 0 || height > 23);{
			System.out.println("Please enter an integer within 0 and 23");
		}
		char[] line = new char[height+1];
		for(int i = 0; i < height; i++){
			for(int j = height; j >= 0; j--){
				if (j < height-i-1){
					line[j] = ' ';
				} else {
					line[j] = '#';
				}
			} System.out.println(line);
		}
	}
}
