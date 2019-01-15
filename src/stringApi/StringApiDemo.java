package stringApi;

/**
 * 此类是用于练习string字符串的例子
 * @author lzz
 *
 */
public class StringApiDemo {
	
	public static void main(String[] args) {
		
		//通过下标来获取元素
//		String str = "tom";
//		System.out.println("=========================");
//		System.out.println("使用charAt方法来获取字符串的第二个元素的结果为：" + str.charAt(1));
//		System.out.println("=========================");
		
		//用来提取字符串
//		String s = "this is demo to test getChars method";
//		int start = 16;
//		int end = 36;
//		char[] buf = new char[36-16];
//		s.getChars(16, 36, buf, 0);
		
		//将字符串转换为字节数组
//		char[] buf = s.toCharArray();
//		System.out.println(buf);
		
		//用于测试革字符串中是否以某个单词开关或者结束
//		System.out.println("hello".startsWith("h"));
//		System.out.println("hello".endsWith("o"));
//		System.out.println("hello".startsWith("o", 3));
		
		//equals用来比较内容，而==则比较是的地址
//		String str = "hello";
//		str += "chengdu";
//		
//		String str2 = "hello chengdu";
//		System.out.println(str2 == str);
		
		
		//使用compareTo方法进行对比，并使用到了冒泡法
//		String[] str = new String[] {
//				"tom","jerry","rose","jack","amy","bob","candy","smith","one","tom"
//		};
//		
//		for (int i = 0; i < str.length; i++) {
//			for(int j = i + 1;j < str.length;j ++) {
//				if(str[i].compareTo(str[j]) < 0) {
//					String t = str[j];
//					str[j] = str[i];
//					str[i] = t;
//				}
//			}
//			System.out.println(str[i]);
//		}
		
//		String s = "the day is good day";
//		
//		System.out.println("从前往后查看g第一次出现的下标位置：" + s.indexOf('g'));
//		System.out.println("查看g最后一次出现的下标位置；" + s.lastIndexOf('g'));
//		
//		System.out.println("从第3个字符开始，查看g第一次出现的下标位置：" + s.indexOf("g",3));
//		System.out.println("从第3个字符开始，查看g最后一次出现的下标位置，从指定索引处开始反向搜索：" + s.lastIndexOf("h", 3));
		
		
//		String org = "This is a test. This is, too.";
//		String search = "is";
//		String sub = "was";
//		String result = "";
//		int i;
		
//		do {
//			System.out.println(org);
//			i = org.indexOf(search);
//			System.out.println("i is:" + i);
//			if(i != -1) {
//				result = org.substring(0, i);
//				System.out.println("result is:" + result);
//				result += sub;
//				System.out.println("result is:" + result);
//				result = result + org.substring(i + search.length());
//				System.out.println("result is:" + result);
//				org = result;
//			}
//		} while (i != -1);
		
		String result = String.join(" ", "this","is","a","test");
		System.out.println(result);
	}

}
