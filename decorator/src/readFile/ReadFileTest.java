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
		          
		        // �����ȡ��Integer.MAX_VALUE = 21 �� 4748 �� 3648 = 2G (Byte)~  
		        byte[] bytes = IOUtils.toByteArray(fis);  
		          
		        System.out.println(bytes.length);  
		          
		        /** ������������Ч������ͨ��~ */  
		        String str1 = new String(bytes);    // ��JVM��Ĭ���ַ��� UTF-8 ���н���~  
//		      String str1 = new String(bytes, 0, bytes.length);   // ͬ��~  
//		      String str1 = new String(bytes, "UTF-8");  
		        System.out.println(str1);  
		          
		        // ��ԭ����  
		        String str2 = new String(bytes, "GBK");  
		        System.out.println(str2);  
		    }  
		  
		}  