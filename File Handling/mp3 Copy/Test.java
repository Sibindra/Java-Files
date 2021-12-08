import java.io.*;

class Test{
    public static void main(String[] args) throws IOException{
        FileInputStream fis=new FileInputStream("orignal.mp3");
        FileOutputStream fos=new FileOutputStream("duplicate.mp3");

        BufferedInputStream bis=new BufferedInputStream(fis);
        BufferedOutputStream bos=new BufferedOutputStream(fos);

        int content;

        while((content=bis.read())!=0){
            bos.write(content);
        }

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }
}