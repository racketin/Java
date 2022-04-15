package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filter {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 14, 11);
		System.out.println(sumStream(list));
		streamUpdate();
	}

	public static int sumStream(List<Integer> integers) {
		return integers.stream().filter(i -> i > 3).mapToInt(i -> i).sum();
	}

	public static void streamUpdate() {
		List<Person> list = new ArrayList<>();
		list.add(new Person(2, "Siddhanta"));
		list.add(new Person(3, "Roahan"));
		list.add(new Person(4, "Pattnaik"));
		list.add(new Person(5, "Shyam"));
		list.stream().filter(person -> person.getId() < 5).forEach(person -> person.setId(5));
		for (Person person : list) {
			System.out.println(person.getId());
		}
	}
}

class Person {
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Integer id;
	private String name;

	Person(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
}
