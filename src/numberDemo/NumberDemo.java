package numberDemo;

public class NumberDemo {
	
	public static void main(String[] args) {
//		String age = "18";
//		Byte ageByte = Byte.parseByte(age);
//		System.out.println("��Ӧ�����ͣ�" + ageByte.getClass().getName());
		
		//�˴������ڲ��Խ��������͵����ݽ��н���֮���ת��
//		Integer num = 123456;
//		System.out.println("ת��Ϊ�����ƣ�" + num.toBinaryString(num));
//		System.out.println("ת��Ϊ�˽��ƣ�" + num.toOctalString(num));
//		System.out.println("ת��Ϊʮ�����ƣ�" + num.toHexString(num));
		
		//�˴����ڲ���char�е�һЩapi
		char[] chars = new char[] {'0',' ','F','f'};
		
		for (int i = 0; i < chars.length; i++) {
			if(Character.isDigit(chars[i])) {
				System.out.println("�ַ�" + chars[i] + "��һ������");
			}
			if(Character.isWhitespace(chars[i])) {
				System.out.println("�ַ�" + chars[i] + "��һ���հ��ַ�");
			}
			if(Character.isLowerCase(chars[i])) {
				System.out.println("�ַ�" + chars[i] + "��һ��Сд�ַ�");
			}
			if(Character.isUpperCase(chars[i])) {
				System.out.println("�ַ�" + chars[i] + "��һ����д�ַ�");
			}
		}
		
	}

}
