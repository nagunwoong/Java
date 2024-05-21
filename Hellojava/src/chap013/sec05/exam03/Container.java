package chap013.sec05.exam03;

public class Container<K, V> {
	private K key;
	private V value;
	
	public K getkey() {
		return this.key;
	}
	
	public V getValue() {
		return this.value;
	}
	
	public void set(K key, V value) {
		this.key = key;
		this.value = value;
		
	}
}
