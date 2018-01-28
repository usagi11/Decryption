import java.util.*;
import java.io.*;

public class main {
		 
	public static void main(String[] args) {
		Number number = new Number();
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a ciphertext:\n");
		String text = scan.nextLine();
		char[] plainText = text.replace(" ", "").toCharArray();
		int [] countNumber = new int[26];
		countNumber = CountChar(plainText);
		char[] ch = {'a','b','c','d', 'e', 'f', 'g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x','y','z'}; 
		List<Number> list = InsertCharAndNumber(ch, countNumber);
		System.out.println();
		System.out.println("Frequency lsit");
		for(Number l : list)
			//System.out.println("'" + l.getC() + "' of frequency is " + l.getNum() + " ");
			System.out.println("'" + l.getC() + "' is " + l.getNum());
		System.out.println();
		Collections.sort(list);
		System.out.println();
		char[] frequencyCharList = FindFrequency();
		List<Number> list2 = AddFrequency(list,frequencyCharList);
		int length = CountLength(list2);
		PrintList(list2);
		System.out.print("PlainText:  " );
		for(char c:plainText){
			System.out.print(c);
		}
		System.out.println();
		System.out.print("Decryption: ");
		char[] decryptionList = null;
		Decryption(list2, plainText, length);
		System.out.println();
	}


	public static int CountLength(List<Number> list){
		int count = 0;
		for(int i = 0; i < list.size(); i++){
				count += list.get(i).getNum();
			
		}
		return count;
	}
	
	public static void Decryption(List<Number> list, char[] plainText, int textLength){
		char[] decryptionList = new char[textLength];
		for(int j = 0; j < plainText.length; j++){
			
				for(int i = 0; i < list.size();i++){
					if(plainText[j] == list.get(i).getC()){
						System.out.print(list.get(i).getFrequency());
						decryptionList[i] = list.get(i).getFrequency();
					}
				
			}
		}
	}
	public static char[] FindFrequency(){
		char[] frequencyList = new char[26];
		frequencyList[0] = 'e';
		frequencyList[1] = 't';
		frequencyList[2] = 'a';
		frequencyList[3] = 'o';
		frequencyList[4] = 'i';
		frequencyList[5] = 'n';
		frequencyList[6] = 's';
		frequencyList[7] = 'h';
		frequencyList[8] = 'r';
		frequencyList[9] = 'd';
		frequencyList[10] = 'l';
		frequencyList[11] = 'c';
		frequencyList[12] = 'u';
		frequencyList[13] = 'm';
		frequencyList[14] = 'w';
		frequencyList[15] = 'f';
		frequencyList[16] = 'g';
		frequencyList[17] = 'y';
		frequencyList[18] = 'p';
		frequencyList[19] = 'b';
		frequencyList[20] = 'v';
		frequencyList[21] = 'k';
		frequencyList[22] = 'j';
		frequencyList[23] = 'x';
		frequencyList[24] = 'q';
		frequencyList[25] = 'z';	
		return frequencyList;
	}
	
	public static List<Number> AddFrequency(List<Number> original, char[] frequency){
		List<Number> newList = new ArrayList<Number>();
		for(int i = 0; i < original.size(); i++){
			newList.add(new Number(original.get(i).getC(), original.get(i).getNum(),  frequency[i]));
		}
		return newList;
	}
	public static void PrintList(List<Number> list){
		for(int i = 0; i < list.size(); i++){
			System.out.println("'" + list.get(i).getC() + "' substrings to '"+ list.get(i).getFrequency() + "'");
		}
	}
	
	
	public static List<Number> InsertCharAndNumber(char[] ch, int[] countNumber){
	List<Number> charList = new ArrayList<Number>();
	for(int i = 0; i < countNumber.length; i++){
		charList.add(new Number(ch[i], countNumber[i]));
	}
		return charList;
	}
	public static boolean Check(char[] plainText, List<Number> list){
		int text = 0;
		for(int i = 0; i < plainText.length; i++){
			while(text == 26){
				for(int j = 0; j < list.size(); j++){
					if(plainText[i] == list.get(j).getC()){
						plainText[i] = list.get(j).getFrequency();
						System.out.print(plainText[i]);
						text = +1;
					}
					else{
						break;
					}
				}
			}
		}
		return true;
	}
		

	
	
	
	public static int[] CountChar(char[] a){
		int aN = 0, bN = 0, cN = 0, dN = 0, eN = 0, fN = 0, gN = 0, hN = 0, iN = 0, jN = 0,
		kN = 0, lN = 0, mN = 0, nN = 0, oN = 0, pN = 0, qN = 0, rN = 0, sN = 0, tN = 0, uN = 0, vN = 0, wN = 0, xN = 0,
		yN = 0, zN = 0;
		int[] countFrequecy = new int[26];
		
		for(int i = 0; i < a.length; i++){
			if(a[i] == 'a' || a[i] == 'A'){
				aN++;
			}
			else if(a[i] == 'b' || a[i] == 'B'){
				bN++;
			}
			else if(a[i] == 'c' || a[i] == 'C'){
				cN++;
			}
			else if(a[i] == 'd' || a[i] == 'D'){
				dN++;
			}
			else if(a[i] == 'e' || a[i] == 'E'){
				eN++;
			}
			else if(a[i] == 'f' || a[i] == 'F'){
				fN++;
			}
			else if(a[i] == 'g' || a[i] == 'G'){
				gN++;
			}
			else if(a[i] == 'h' || a[i] == 'H'){
				hN++;
			}
			else if(a[i] == 'i' || a[i] == 'I'){
				iN++;
			}
			else if(a[i] == 'j' || a[i] == 'J'){
				jN++;
			}
			else if(a[i] == 'k' || a[i] == 'K'){
				kN++;
			}
			else if(a[i] == 'l' || a[i] == 'L'){
				lN++;
			}
			else if(a[i] == 'm' || a[i] == 'M'){
				mN++;
			}
			else if(a[i] == 'n' || a[i] == 'M'){
				nN++;
			}
			else if(a[i] == 'o' || a[i] == 'O'){
				oN++;
			}
			else if(a[i] == 'p' || a[i] == 'P'){
				pN++;
			}
			else if(a[i] == 'q' || a[i] == 'Q'){
				qN++;
			}
			else if(a[i] == 'r' || a[i] == 'R'){
				rN++;
			}
			else if(a[i] == 's' || a[i] == 'S'){
				sN++;
			}
			else if(a[i] == 't' || a[i] == 'T'){
				tN++;
			}
			else if(a[i] == 'u' || a[i] == 'U'){
				uN++;
			}
			else if(a[i] == 'v' || a[i] == 'V'){
				vN++;
			}
			else if(a[i] == 'w' || a[i] == 'W'){
				wN++;
			}
			else if(a[i] == 'x' || a[i] == 'X'){
				xN++;
			}
			else if(a[i] == 'y' || a[i] == 'Y'){
				yN++;
			}
			else{
				zN++;
			}
		}

		countFrequecy[0] = aN; //a
		countFrequecy[1] = bN; //b
		countFrequecy[2] = cN; //c
		countFrequecy[3] = dN; //d
		countFrequecy[4] = eN; //e 
		countFrequecy[5] = fN; //f
		countFrequecy[6] = gN; //g
		countFrequecy[7] = hN; //h
		countFrequecy[8] = iN; //i
		countFrequecy[9] = jN; //j
		countFrequecy[10] = kN; //k
		countFrequecy[11] = lN; //l
		countFrequecy[12] = mN; //m
		countFrequecy[13] = nN; //n
		countFrequecy[14] = oN; //o
		countFrequecy[15] = pN; //p
		countFrequecy[16] = qN; //q
		countFrequecy[17] = rN; //r 
		countFrequecy[18] = sN; //s
		countFrequecy[19] = tN; //t
		countFrequecy[20] = uN; //u
		countFrequecy[21] = vN; //v
		countFrequecy[22] = wN; //w
		countFrequecy[23] = xN; //x
		countFrequecy[24] = yN; //y
		countFrequecy[25] = xN; //z

		return countFrequecy;
		}
	
	
}
