package outofmemoryerror;

// this is an example of outofmemoryerror in java 
// In this program, I deliberately minimized the heap size to 1mb and tried to create object of very big size to get outofmemoryerror due to too many big size object creations
// But usually the reason behind this error could be memory leaks, amount of live data barely fits into the Java heap, problem with garbage collector, permanent generation space exhaustion, etc.
// In this case, heap get out of memory before stack gets overflow
// you can have a look at the screenshot of terminal command error message attached
public class A {
	// whenever someone creates an object of this class
	// new object is created in heap
	// then that object will create new object too, to initialize its instance level reference variable
	// this process will go on and infinite objects will be created
	// calling too many constructors in turn will give us stack overflow error at runtime as we get in recursion
	// In this case too many constructors are loaded on stack and too many big size objects are created in heap as well
	// and we will get out of heap space before stack overflows
	A a=new A();
	int x=10;
	String s1="vhgvhhghjghghjghjghjgh~!@#$%^&*()_+{}:<>?ASDFGHJKL:QWERTYUIOPZXCVBNM<>??/*/*/*/*/ghjgjhghjghjjgjguytfghuiyghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh233765476658rtfy7675trfgy765rtyfygt6rdfghyt6rdfghytrfgvhjiuhbnjki8uyhjio987ytfghy6543ewser43w2asder43wasdr4e3wsdr4e3wesdfgty65rfghu7yghjiuhjio88uhjio98uhbnjhnmkjnm,l;l.'][;l[][';.'//./';.,;[p[-=[p-=p-=0p-0oio9uytrdese3sderfcgyhbjinmklkmklkmkjnjhbvgfdsew2`w3e1df2gyuhb3jrntgjhfbdhjwgdfggdcghdbh~!@#$%^&*(kgfhgfhgfcghcfhgfgcgfcfgcfcfgcfgcfgggggggggggggdfjtyytdrytfcfvjhgytuifytdutfcjugfuytidufghfhlifudfjcgfyftdjgcgvhufcgfydgcfdxcgfuydgcgvftydgcidrufgitidyf";
	String s2="vhgvhhghjghghjghjghjgh~ghghj!@#$%^&*()_+{}:<>?ASDFGHJKL:QWERTYUIOPZXCVBNM<>??/*/*/*/*/ghjgjhghjghjjgjguytfghuiyghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh233765476658rtfy7675trfgy765rtyfygt6rdfghyt6rdfghytrfgvhjiuhbnjki8uyhjio987ytfghy6543ewser43w2asder43wasdr4e3wsdr4e3wesdfgty65rfghu7yghjiuhjio88uhjio98uhbnjhnmkjnm,l;l.'][;l[][';.'//./';.,;[p[-=[p-=p-=0p-0oio9uytrdese3sderfcgyhbjinmklkmklkmkjnjhbvgfdsew2`w3e1df2gyuhb3jrntgjhfbdhjwgdfggdcghdbh~!@#$%^&*(kgfhgfhgfcghcfhgfgcgfcfgcfcfgcfgcfgggggggggggggdfjtyytdrytfcfvjhgytuifytdutfcjugfuytidufghfhlifudfjcgfyftdjgcgvhufcgfydgcfdxcgfuydgcgvftydgcidrufgitidyf";
	String s3="hghvhvvhgvhhghjghghjghjghjgh~!@#$%^&*()_+{}:<>?ASDFGHJKL:QWERTYUIOPZXCVBNM<>??/*/*/*/*/ghjgjhghjghjjgjguytfghuiyghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh233765476658rtfy7675trfgy765rtyfygt6rdfghyt6rdfghytrfgvhjiuhbnjki8uyhjio987ytfghy6543ewser43w2asder43wasdr4e3wsdr4e3wesdfgty65rfghu7yghjiuhjio88uhjio98uhbnjhnmkjnm,l;l.'][;l[][';.'//./';.,;[p[-=[p-=p-=0p-0oio9uytrdese3sderfcgyhbjinmklkmklkmkjnjhbvgfdsew2`w3e1df2gyuhb3jrntgjhfbdhjwgdfggdcghdbh~!@#$%^&*(kgfhgfhgfcghcfhgfgcgfcfgcfcfgcfgcfgggggggggggggdfjtyytdrytfcfvjhgytuifytdutfcjugfuytidufghfhlifudfjcgfyftdjgcgvhufcgfydgcfdxcgfuydgcgvftydgcidrufgitidyf";
	String s4="vhgvhhghjghghjghjghjgh~!@#$%^&*()_+{}:<>?ASDFGHJKL:QWERTYUIOPZXCVBNM<>??/*/*/*/*/ghjgjhghjghjjgjguytfghuiyghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh233765476658rtfy7675trfgy765rtyfygt6rdfghyt6rdfghytrfgvhjiuhbnjki8uyhjio987ytfghy6543ewser43w2asder43wasdr4e3wsdr4e3wesdfgty65rfghu7yghjiuhjio88uhjio98uhbnjhnmkjnm,l;l.'][;l[][';.'//./';.,;[p[-=[p-=p-=0p-0oio9uytrdese3sderfcgyhbjinmklkmklkmkjnjhbvgfdsew2`w3e1df2gyuhb3jrntgjhfbdhjwgdfggdcghdbh~!@#$%^&*(kgfhgfhgfcghcfhgfgcgfcfgcfcfgcfgcfgggggggggggggdfjtyytdrytfcfvjhgytuifytdutfcjugfuytidufghfhlifudfjcgfyftdjgcgvhufcgfydgcfdxcgfuydgcgvftydgcidrufgitidyfuhghghjghg";
	String s5="vvhgvhhghjghghjghjghjgh~!@#$%^&*()_+{}:<>?ASDFGHJKL:QWERTYUIOPZXCVBNM<>??/*/*/*/*/ghjgjhghjghjjgjguytfghuiyghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh233765476658rtfy7675trfgy765rtyfygt6rdfghyt6rdfghytrfgvhjiuhbnjki8uyhjio987ytfghy6543ewser43w2asder43wasdr4e3wsdr4e3wesdfgty65rfghu7yghjiuhjio88uhjio98uhbnjhnmkjnm,l;l.'][;l[][';.'//./';.,;[p[-=[p-=p-=0p-0oio9uytrdese3sderfcgyhbjinmklkmklkmkjnjhbvgfdsew2`w3e1df2gyuhb3jrntgjhfbdhjwgdfggdcghdbh~!@#$%^&*(kgfhgfhgfcghcfhgfgcgfcfgcfcfgcfgcfgggggggggggggdfjtyytdrytfcfvjhgytuifytdutfcjugfuytidufghfhlifudfjcgfyftdjgcgvhufcgfgvghfdcgvresdew4543212345678ydgcfdxcgfuydgcgvftydgcidrufgitidyf";
	double x1=1,x2=1,x3=1,x4=1,x5=1,x6=1,x7=1,x8=1,x9=1,x10=1,x11=1,x12=1,x13=1,x14=1,x15=1,x16=1,x17=1,x18=1,x19=1,x20=1;
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println(a.x);
	}
	
}
