package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class nhom4 {
	void Try(int i, String s,String folderPath  ) throws IOException{
	      
        File dir = new File(folderPath);
        File[] files = dir.listFiles();     
         Scanner scanner;
        FileInputStream fis;
        for (File file : files) {
            if (file.isFile()) {
                fis = new FileInputStream(file.getCanonicalPath());
                scanner = new Scanner(fis);
                String str;
                
                 while (scanner.hasNextLine()) {
                    str = scanner.nextLine();
                    if(str.indexOf(s)==-1) {
						continue;
					}
					else {
						System.out.println(file.getCanonicalPath());
						
					
                                                break;
					}
                   }}
            else 
           Try(i++, s, file.toString());
            
       
}}    
    public static void main(String[] args) throws IOException  {
        System.out.println("Nhập đường dẫn đến thư mục để tìm tập tin(ví dụ:D:\\nhom4) ");
        Scanner s1 = new Scanner(System.in,"utf8");
        String folderPath = s1.nextLine();
        String s;
        System.out.println("nhap tu muon tim ");
        s = s1.nextLine();
        nhom4 a = new nhom4();
        
        int b=1;
        a.Try(b, s, folderPath);
        
       }
    

	
}
