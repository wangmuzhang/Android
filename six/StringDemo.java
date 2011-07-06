public class StringDemo{
  public static void main(String[] args){
	String text="hello";
	System.out.println("字符串内容：" + text);
	System.out.println("字符串长度：" + text.length());
	System.out.println("等于hello?："+ 
				text.equals("hello"));
	System.out.println("转为大写："+ 
				text.toUpperCase());
	System.out.println("转为小写："+ 
				text.toLowerCase());
  }

}