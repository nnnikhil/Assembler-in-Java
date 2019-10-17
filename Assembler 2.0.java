import java.io.*;
import java.lang.Math;
import java.util.*;
// TO DO
// Map each of the elements in input file to a memory location
// Print the output in correct format
// error handling
public class CO {                                      // main class	
	public static int PC=0;						   // Incremented each time instruction is executed
	public static int ILC=0;
	
	public static  class instructions{
		
		
		private int opcodeBinary;
		private String opcodeEnglish;
		private int operandBinary;
		private String operandEnglish;
		
		
		Map<String,String> mapofopcode=new HashMap<String,String>();
	public void mapping(){	
		
		mapofopcode.put("CLA","0000");
		mapofopcode.put("LAC","0001");
		mapofopcode.put("SAC","0010");
		mapofopcode.put("ADD","0011");
		mapofopcode.put("SUB","0100");
		mapofopcode.put("BRZ","0101");
		mapofopcode.put("BRN","0110");
		mapofopcode.put("BRP","0111");
		mapofopcode.put("INP","1000");
		mapofopcode.put("DSP","1001");
		mapofopcode.put("MUL","1010");
		mapofopcode.put("DIV","1011");
		mapofopcode.put("STP","1100");
	
	}
	
	public String resolve(String param1) {        // if c==-1 print no such instruction found....else print the opcode in binary
		
		String c=null;
		if(mapofopcode.containsKey(param1));
		c= mapofopcode.get(param1);
		
		return c;
		
		
	}
	
	
	public void showopcodetable() {
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Opcode Table");
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("*****************************************************************************************************************************");
		System.out.println("Opcode				Operand				Opcode Binary				Instruction Length");
		System.out.println("*****************************************************************************************************************************");
		System.out.println("CLA				-------				0000						2");
		System.out.println("LAC				Mem Add				0001						2");
		System.out.println("SAC				Mem Add				0010						2");
		System.out.println("ADD				Mem Add				0011						2");
		System.out.println("SUB				Mem Add				0100						2");
		System.out.println("BRZ				-------				0101						2");
		System.out.println("BRN				-------				0110						2");
		System.out.println("BRP				-------				0111						2");
		System.out.println("INP				-------				1000						2");
		System.out.println("DSP				Mem Add				1001						2");
		System.out.println("MUL				Mem Add				1010						2");
		System.out.println("DIV				Mem Add				1011						2");
		System.out.println("STP				-------				1100						2");
		System.out.println("******************************************************************************************************************************");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	public static class symbols{
		int A=157;
		int B=159;
		int C=161;
		int D=163;
		int E=164;
		
		ArrayList<String> instructionlist=new ArrayList<String>();
		ArrayList<String> memory=new ArrayList<String>();
		String[] checks=new String[100];
		int k=0;
		ArrayList<String> symbollist=new ArrayList<String>();

		
		
	
		
		public void addintoinstructionlist(String param1) {
			instructionlist.add(param1);
		}
		public void addintomemorylist(String param1) {
			memory.add(param1);
		}
		int[] auxxy=new int[20];
		public void showsymboltablepassone() {
			System.out.println("Symbol Table for pass 1");
			System.out.println("");
			System.out.println("***************************");
			System.out.println("Symbol		Location");
			System.out.println("***************************");
			for(int i=0;i<symbollist.size();i++) {
				
						System.out.println(symbollist.get(i));
				}
			System.out.println("***************************");
				
			
		}
		
		
		public void showsymboltablepasstwo() {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("Symbol Table for pass 2");
			System.out.println("");
			System.out.println("***************************");
			System.out.println("Symbol		Location");
			System.out.println("***************************");
			String str1=null,str2=null,str3=null,str4=null;
			for(int i=0;i<symbollist.size();i++) {
				
				if(symbollist.get(i).contentEquals("A")) {
					System.out.println(symbollist.get(i)+"               "+Integer.toBinaryString(A));
				}
				if(symbollist.get(i).contentEquals("B")) {
					System.out.println(symbollist.get(i)+"               "+Integer.toBinaryString(B));
				}
				if(symbollist.get(i).contentEquals("C")) {
					System.out.println(symbollist.get(i)+"               "+Integer.toBinaryString(C));
				}
				if(symbollist.get(i).contentEquals("D")) {
					System.out.println(symbollist.get(i)+"               "+Integer.toBinaryString(D));
				}
				}
			
			System.out.println("***************************");	
			
		}
		
	
	}
	
	public static class labels{
		ArrayList<String> labellist=new ArrayList<String>();
		
		public void addintolabellist(String param1) {
			labellist.add(param1);
		}
	}
	
	
	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		int ilcforlabelscounter=0;
		symbols s=new symbols();
		instructions i1=new instructions();
		labels l=new labels();
		i1.mapping();
		ArrayList<Integer> ilcforlabels=new ArrayList<Integer>();
		ArrayList<String> memoryintobinary=new ArrayList<String>();
		ArrayList<String> correspondingopcodebinar=new ArrayList<String>();
		
		int A=157;
		int B=159;
		int C=161;
		int D=163;
		int E=164;
	
		
		FileReader input=null;
		
		String[] aux=new String[50];
		
		try {
		
			String line=null;
			input=new FileReader("in.txt");
			
			
			BufferedReader buff=new BufferedReader(input);
			
			int k=0;
			while((line=buff.readLine())!=null) {
				aux[k++]=line;            // store each line of input-- need to be splitted later
				
			
				}
			
			
		}
		catch(FileNotFoundException e2) {
			System.out.println("Unable to open file 'in.txt'");
		}
		catch(IOException e) {
			System.out.println("Error reading file 'in.txt'");
		}
		finally {
			if(input!=null) {
				input.close();
			}
		
			
		}
	//	for(int l=0;l<aux.length;l++) {
		//System.out.println(aux[l]);
		//}
	
		int ilc=0;
		String[] auxarray=null;
		for(int i=0;i<aux.length;i++) {
		
			if(aux[i]!=null) {
			auxarray=aux[i].split(" ");
			if(auxarray[0].contentEquals("START")) {
				ilc+=Integer.parseInt(auxarray[1]);
				continue;
			}
			if(auxarray[0].contentEquals("L1")||auxarray[0].contentEquals("L2")||auxarray[0].contentEquals("L3")||auxarray[0].contentEquals("L4")||auxarray[0].contentEquals("L5")) {
				s.addintoinstructionlist(auxarray[1]);                 // add auxarray[0] into label list
				l.addintolabellist(auxarray[0]);
				int auxy=ilc;
				ilcforlabels.add(auxy);
				
			}
			else {
			s.addintoinstructionlist(auxarray[0]);
			}
			if(auxarray.length==2) {
				s.addintomemorylist(auxarray[1]);
				
			}
			else if(auxarray.length==3) {
				s.addintomemorylist(auxarray[2]);
	
			}
			else {
				s.addintomemorylist("-");
			}
			}
			//s.addintoarraylist2(auxarray[0]);
		ilc+=2;
		}
		
		//s.symbollist.get(0);
//for(int i=0;i<s.instructionlist.size();i++) {
	//	System.out.println(s.instructionlist.get(i));       // working fine ( contains the opcode )
	//}

//for(int i=0;i<s.memory.size();i++) {
	//System.out.println(s.memory.get(i));
	
//}
for(int i=0;i<s.memory.size();i++) {
	String auxy=null;
	if(s.memory.get(i).contentEquals("A")){
		auxy=Integer.toBinaryString(A);
		if(s.symbollist.contains("A")==false)
		s.symbollist.add(s.memory.get(i));
		
	}
	if(s.memory.get(i).contentEquals("B")){
		auxy=Integer.toBinaryString(B);
		if(s.symbollist.contains("B")==false)
		s.symbollist.add(s.memory.get(i));
		
	}
	if(s.memory.get(i).contentEquals("C")){
		auxy=Integer.toBinaryString(C);	
		if(s.symbollist.contains("C")==false)
		s.symbollist.add(s.memory.get(i));
	}
	if(s.memory.get(i).contentEquals("D")){
		auxy=Integer.toBinaryString(D);
		if(s.symbollist.contains("D")==false)
		s.symbollist.add(s.memory.get(i));
	}
	for(int k=0;k<l.labellist.size();k++) {
	if(l.labellist.get(k).contentEquals(s.memory.get(i))) {
		auxy=Integer.toBinaryString(ilcforlabels.get(k));
		//System.out.println(auxy+"hello");
	}
	}	
	memoryintobinary.add(auxy);
}


String[] correspondingopcodebinary=new String[50];              // (working fine)contains the opcode in binary for the opcodes in file
String n=null;
for(int i=0;i<s.instructionlist.size();i++) {
	String st=s.instructionlist.get(i);
	//System.out.println(st);
	if(st!=null)
	{n=i1.resolve(st);
	}
	correspondingopcodebinary[i]=n;
	correspondingopcodebinar.add(n);
	
	
}

//for(int i=0;i<correspondingopcodebinar.size();i++) {             //
	//System.out.println(correspondingopcodebinar.get(i));
//}
//for(int i=0;i<l.labellist.size();i++) {
	//System.out.println(l.labellist.get(i));
//}
//for(int i=0;i<memoryintobinary.size();i++) {
	//System.out.println(memoryintobinary.get(i));
//}
BufferedWriter output=null;
try {
	 output = new BufferedWriter(new FileWriter("out.txt"));
	for(int i=0;i<correspondingopcodebinar.size();i++) {
		
		//String aux2=correspondingopcodebinar.get(i)+" "+memoryintobinary.get(i);
		String aux3=null;
		if(correspondingopcodebinar.get(i)!=null) {
		aux3=correspondingopcodebinar.get(i);
		}
		else {
			aux3="";
		}
		String aux4=null;
		if(memoryintobinary.get(i)!=null) {
		aux4=memoryintobinary.get(i);
		}
		else {
			aux4="";
		}
		String aux5=aux3+" "+aux4;
		output.write(aux5);
		output.newLine();
		
	}
}
finally {
	if(output!=null) {
		output.close();
	}
}

s.showsymboltablepassone();
i1.showopcodetable();
s.showsymboltablepasstwo();





	}
}