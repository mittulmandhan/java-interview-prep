package example13;

public class A {
	public static void main(String[] args) {
		String s = " Mittul Mandhan ";
		String mystr1 = new String(" Mittul Mandhan ");
		String mystr2 = new String(" mittul mandhan ");
		String mystr3 = "Mittul";
		String mystr4 = "miTTul";

		System.out.println(s.length());// 16
		System.out.println(s.charAt(8));// 'M'
		System.out.println(s.substring(8));// "Mandhan "
		System.out.println(s.substring(3, 7));// "ttul"
		System.out.println(s.concat("is me"));// " Mittul Mandhan is me"
		System.out.println(s.indexOf("Mittul"));// 1
		System.out.println(s.lastIndexOf("dhan"));
		System.out.println(s.equals(mystr1));
		System.out.println(s.equalsIgnoreCase(mystr2));
		System.out.println(s.compareTo(mystr3));
		System.out.println(s.compareToIgnoreCase(mystr4));
		System.out.println(mystr4.toLowerCase());
		System.out.println(mystr4.toUpperCase());
		System.out.println(s.trim());
		System.out.println(s.replace('M', 'R'));
	}
}