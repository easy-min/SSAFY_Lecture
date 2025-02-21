import java.util.PriorityQueue;

//class Person implements Comparable<Person>{
//	String name;
//	int age;
//	public Person() {
//		//this("김싸피",13); 기본생성자로 만들어짐 (this와 super는 같이 쓸 수 없음. 둘 다 첫번째 줄에 와야해서)
//	}
//	public Person(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	@Override
//	public int compareTo(Person o) {
//		//나이순으로? (오름차순)
////			return this.age - o.age;
//		//이름순으로?
//		return this.name.compareTo(o.name);
//	}
//	@Override
//	public String toString() {
//		return "Person [name=" + name + ", age=" + age + "]";
//	}
//	
//} // person class


public class Heap03_PersonPQ1 {
	public static void main(String[] args) {
		PriorityQueue<Person> pq = new PriorityQueue<>();
		pq.add(new Person("정봉기", 25));
		pq.add(new Person("강건", 38));
		pq.add(new Person("김준영", 26));
		pq.add(new Person("최시영", 16));
		System.out.println(pq.poll());
		
	}

}




















