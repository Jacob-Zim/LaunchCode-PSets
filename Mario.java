import java.util.Scanner;
import java.io.*;
public class Mario {

	public static void main(String[] args) {
		Pyramid.getInstance().cslOrTxt();
		Pyramid.getInstance().height();
		String cslOrTxt = Pyramid.getInstance().cslOrTxt;
		int h = Pyramid.getInstance().h;
		Pyramid.createPyramid(h, cslOrTxt);
		}
	}
