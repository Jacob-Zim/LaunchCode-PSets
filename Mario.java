import java.util.Scanner;
import java.io.*;
public class Mario {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int height = 0;
		String cslOrTxt;
		while (true) {
			System.out.println("Would you like to save a txt file or print to console? \n"
					+ "(csl) (txt)");
			cslOrTxt = s.nextLine();
			if (!((cslOrTxt.equals("csl")) || (cslOrTxt.equals("txt")))){
				System.out.println("Please enter either txt (txt file) or csl (print to console)");
				continue;
			} else break;
		}
		do {
			  System.out.println("Enter a height within 0 and 23");
			  height = s.nextInt();
			} while (height < 0 || height > 23);
		String[] lines = new String[height];
		char[] line = new char[height+1];
		for(int i = 0; i < height; i++){
			for(int j = height; j >= 0; j--){
				if (j < height-i-1){
					line[j] = ' ';
				} else {
					line[j] = '#';
				}
			}
			if (cslOrTxt.equals("csl")){ 
				System.out.println(line);
			} else {
				lines[i] = new String(line);
			}
		}
		if (cslOrTxt.equals("txt")) {
			try {
			Scanner m = new Scanner(System.in);
			String path;
			System.out.println("Please enter the directory for this file (will save as Mario.txt)");
			path = m.nextLine();
			PrintWriter writer = new PrintWriter(path + "\\"+"Mario.txt", "UTF-8");
			for (int l = 0; l < height; l++){
				writer.println(lines[l]);
			}
			writer.close();
			System.out.println("Txt File Saved!");
			} catch (Exception e){
				System.out.println("looks like the path you entered doesn't exist!");
			}
		}
	}
}
