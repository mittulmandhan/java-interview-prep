## Verbose Command


Source code 

'''
class VerboseDemo {
	
	public static void main(String args[]) {
		System.out.println("Hello World");
	}
}
'''

command to compile : javac VerboseDemo.java

command to show verbose : javap -verbose VerboseDemo

command to save verbose in file : javap -verbose VerboseDemo >> abcd.txt
