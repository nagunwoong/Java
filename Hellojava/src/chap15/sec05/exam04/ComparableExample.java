package chap15.sec05.exam04;

import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		// 비교자를 제공한 TreeSet  컬랙션을 생성
	TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());
	// TreeSet을 생성할때 FruitComparator를 비교하는 비교자로 사용함
		
	
	//객체 저장
	treeSet.add(new Fruit("포도",3000));
	treeSet.add(new Fruit("수박",50000));
	treeSet.add(new Fruit("딸기",25000));
	treeSet.add(new Fruit("복숭아",15000));
	
	//객체를 하나씩 가져오기
	for(Fruit fruit : treeSet) {
		System.out.println(fruit.name + " : " + fruit.price);
	}
	
	}

}
