package entities;

public class Node {

	Integer key;
	Integer freq;
	public Node(int key,int freq) {
		this.key=key;
		this.freq=freq;

	}
	public int getKey() {
		return key;
	}
	public void setKey(int key) {
		this.key = key;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	

}
