import java.util.Comparator;

public class AgeComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age - o2.age; // 오름차순으로 정렬하기
//		return o2.age - o1.age; // 내림차순으로 정렬하기
//		return Integer.compare(o1.age - o2.age);
	}
}
