package task2;

import java.util.Scanner;

public class Check {
public static void main(String[] args) {
System.out.println("请输入需要判断的字符串");
Scanner sc=new Scanner(System.in);
String testStr=sc.next();
char[] test=testStr.toCharArray();
for (char c : test) {
int temp=(int)c;
if(temp>57)
{
System.out.println("字符");
return;
}

    }
    System.out.println("整数");

}
}