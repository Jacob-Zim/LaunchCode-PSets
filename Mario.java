import java.util.Scanner;
import java.io.*;
public class Mario {

	private Pyramid pyramid;

	public Mario(Pyramid pyramid) {
		// TODO Auto-generated constructor stub
		this.pyramid = pyramid;
	}

	public static void main(String[] args) {
		Mario mario = new Mario(Pyramid.getInstance());
		mario.run();
	}
	
	public void run(){
		pyramid.cslOrTxt();
		pyramid.height();
		Pyramid.createPyramid(pyramid.h, pyramid.cslOrTxt);
	}
}
