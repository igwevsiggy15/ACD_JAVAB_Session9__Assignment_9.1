package Assign9_1;

import java.util.HashMap;
import java.util.Set;

class Empcode implements Comparable<Empcode>{
	String code;
	public Empcode(String code) {
		this.code = code;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Empcode) {
			Empcode emp = (Empcode)o;
			return this.code.equals(emp.code);
		}
		return false;
	}

	@Override
	public int compareTo(Empcode o) {
		if (o != null) {
			return this.code.compareTo(o.code);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return this.code;
	}
	
}

class EmpName implements Comparable<EmpName>{
	String name;
	
	public EmpName(String name) {
		this.name = name;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o != null && o instanceof Empcode) {
			EmpName emp = (EmpName)o;
			return this.name.equals(emp.name);
		}
		return false;
	}

	@Override
	public int compareTo(EmpName o) {
		if (o != null) {
			return this.name.compareTo(o.name);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}

public class HashMapMain {
	public static void main(String[] args) {
		HashMap<Empcode, EmpName> hm= new HashMap<Empcode, EmpName>();
		
		for (int i = 0; i <10; i++) {
			hm.put(new Empcode("Key" + (i+1)), new EmpName("Name" + (i+1)));
		}
	
		Set<Empcode> codes = hm.keySet();
		System.out.println("Printing names...");
		
		for (Empcode empcode : codes) {
			System.out.println(hm.get(empcode));
		}
	}
	
}