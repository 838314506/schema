package stringApi;

/**
 * ������������ϰstring�ַ���������
 * @author lzz
 *
 */
public class StringApiDemo {
	
	public static void main(String[] args) {
		
		//ͨ���±�����ȡԪ��
//		String str = "tom";
//		System.out.println("=========================");
//		System.out.println("ʹ��charAt��������ȡ�ַ����ĵڶ���Ԫ�صĽ��Ϊ��" + str.charAt(1));
//		System.out.println("=========================");
		
		//������ȡ�ַ���
//		String s = "this is demo to test getChars method";
//		int start = 16;
//		int end = 36;
//		char[] buf = new char[36-16];
//		s.getChars(16, 36, buf, 0);
		
		//���ַ���ת��Ϊ�ֽ�����
//		char[] buf = s.toCharArray();
//		System.out.println(buf);
		
		//���ڲ��Ը��ַ������Ƿ���ĳ�����ʿ��ػ��߽���
//		System.out.println("hello".startsWith("h"));
//		System.out.println("hello".endsWith("o"));
//		System.out.println("hello".startsWith("o", 3));
		
		//equals�����Ƚ����ݣ���==��Ƚ��ǵĵ�ַ
//		String str = "hello";
//		str += "chengdu";
//		
//		String str2 = "hello chengdu";
//		System.out.println(str2 == str);
		
		
		//ʹ��compareTo�������жԱȣ���ʹ�õ���ð�ݷ�
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
//		System.out.println("��ǰ����鿴g��һ�γ��ֵ��±�λ�ã�" + s.indexOf('g'));
//		System.out.println("�鿴g���һ�γ��ֵ��±�λ�ã�" + s.lastIndexOf('g'));
//		
//		System.out.println("�ӵ�3���ַ���ʼ���鿴g��һ�γ��ֵ��±�λ�ã�" + s.indexOf("g",3));
//		System.out.println("�ӵ�3���ַ���ʼ���鿴g���һ�γ��ֵ��±�λ�ã���ָ����������ʼ����������" + s.lastIndexOf("h", 3));
		
		
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
