package src.main.java.com.jacobzimmerman.launchcode;
import java.io.PrintWriter;
import java.util.Scanner;
public class Pyramid {
	String cslOrTxt;
	int h;
	private Pyramid() {}
	
	private static Pyramid pyramid;
	
	public static Pyramid getInstance() {
		if (pyramid == null) {
			pyramid = new Pyramid();
		}
		return pyramid;
	}
	public static void createPyramid(int h, String cslOrTxt){
		String[] lines = new String[h];
		char[] line = new char[h+1];
		for(int i = 0; i < h; i++){
			for(int j = h; j >= 0; j--){
				if (j < h-i-1){
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
		} if (cslOrTxt.equals("txt")) {
			try {
			Scanner m = new Scanner(System.in);
			String path;
			System.out.println("Please enter the directory for this file (will save as Mario.txt)");
			path = m.nextLine();
			PrintWriter writer = new PrintWriter(path + "\\"+"Mario.txt", "UTF-8");
			for (int l = 0; l < h; l++){
				writer.println(lines[l]);
			}
			writer.close();
			System.out.println("Txt File Saved!");
			} catch (Exception e){
				System.out.println("looks like the path you entered doesn't exist!");
			}
		}
	}
	public void cslOrTxt(){
		Scanner s = new Scanner(System.in);
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
		this.cslOrTxt = cslOrTxt;
	}
	public void height(){
		Scanner s = new Scanner(System.in);
		int height = 0;
		do {
			  System.out.println("Enter a height within 0 and 23");
			  height = s.nextInt();
			} while (height < 0 || height > 23);
		h = height;
	}
}
