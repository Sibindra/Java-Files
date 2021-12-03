import java.io.*;

class Test{
	public static void main(String[] args) throws IOException {
		// object in for input stream 
		FileInputStream in=new FileInputStream("orignal.txt");
		// object out for output stream
		FileOutputStream out= new FileOutputStream("duplicate.txt");

		// content is the number of characters on the file
		int content;
		
		while((content=in.read())!=-1){
			out.write(content);
		}

		in.close();
		out.close();
	}
}