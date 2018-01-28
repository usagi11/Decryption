import java.util.ArrayList;
import java.util.List;

public class Number implements Comparable<Number>{
	private char c;
	private char frequency;
	private int num;
	private Number number;
	
	public Number(){}
	
	public Number(char c, int num, char frequency){
		this.c = c;
		this.num = num;
		this.frequency = frequency;
	}
	
	public Number (char c, int num){
		this.c = c;
		this.num = num;
	}
	public Number(char c){
		this.c = c;
	}

	public Number(Number number, char frequency) {
		this.number = number;
		this.frequency = frequency;
	}
	public int compareTo(Number n){
		if(this.num > n.num){
			return -1;
		}
		if(this.num < n.num){
			return 1;
		}
		else
			return 0;
	}

	
	public void setC(char c){
		this.c = c;
	}
	public char getC(){
		return c;
	}
	public void setFrequency(char frequency){
		this.frequency = frequency;
	}
	public char getFrequency(){
		return frequency;
	}
	public void setNum(int num){
		this.num = num;
	}
	public int getNum(){
		return num;
	}


}
