package task2;

import java.util.Scanner;

public class Check {
public static void main(String[] args) {
System.out.println("��������Ҫ�жϵ��ַ���");
Scanner sc=new Scanner(System.in);
String testStr=sc.next();
char[] test=testStr.toCharArray();
for (char c : test) {
int temp=(int)c;
if(temp>57)
{
System.out.println("�ַ�");
return;
}

    }
    System.out.println("����");

}
}