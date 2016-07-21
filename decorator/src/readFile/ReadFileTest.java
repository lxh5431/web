package readFile;

import java.io.File;
import java.io.FileInputStream;

public class ReadFileTest {

		static String path = "src/test.txt";
		
		    /** 
		     * @param args 
		     */  
		    public static void main(String[] args) throws Exception {  
		        // TODO Auto-generated method stub  
		        File f = new File(path);  
		        FileInputStream fis = new FileInputStream(f);  
		          
		        // 无损读取，Integer.MAX_VALUE = 21 亿 4748 万 3648 = 2G (Byte)~  
		        byte[] bytes = IOUtils.toByteArray(fis);  
		          
		        System.out.println(bytes.length);  
		          
		        /** 以下三句代码的效果是相通的~ */  
		        String str1 = new String(bytes);    // 按JVM的默认字符集 UTF-8 进行解码~  
//		      String str1 = new String(bytes, 0, bytes.length);   // 同上~  
//		      String str1 = new String(bytes, "UTF-8");  
		        System.out.println(str1);  
		          
		        // 还原编码  
		        String str2 = new String(bytes, "GBK");  
		        System.out.println(str2);  
		    }  
		  
		}  