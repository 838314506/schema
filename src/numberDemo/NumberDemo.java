package numberDemo;

public class NumberDemo {
	
	public static void main(String[] args) {
//		String age = "18";
//		Byte ageByte = Byte.parseByte(age);
//		System.out.println("对应的类型：" + ageByte.getClass().getName());
		
		//此处是用于测试将整数类型的数据进行进制之间的转换
//		Integer num = 123456;
//		System.out.println("转换为二进制：" + num.toBinaryString(num));
//		System.out.println("转换为八进制：" + num.toOctalString(num));
//		System.out.println("转换为十六进制：" + num.toHexString(num));
		
		//此处用于测试char中的一些api
		char[] chars = new char[] {'0',' ','F','f'};
		
		for (int i = 0; i < chars.length; i++) {
			if(Character.isDigit(chars[i])) {
				System.out.println("字符" + chars[i] + "是一个数字");
			}
			if(Character.isWhitespace(chars[i])) {
				System.out.println("字符" + chars[i] + "是一个空白字符");
			}
			if(Character.isLowerCase(chars[i])) {
				System.out.println("字符" + chars[i] + "是一个小写字符");
			}
			if(Character.isUpperCase(chars[i])) {
				System.out.println("字符" + chars[i] + "是一个大写字符");
			}
		}
		
	}

}
