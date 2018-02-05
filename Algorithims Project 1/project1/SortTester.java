package project1;
import java.util.ArrayList;
public class SortTester {

	public static void main(String[] args) {
		SorterADT<Integer> sorter = new ArraySorterADT<Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list.add(50);
		list2.add(50);
		list.add(100);
		list2.add(75);
		list.add(75);
		list2.add(100);
		
		System.out.println(sorter);
		System.out.println(list);
		System.out.println(list2);
		System.out.println("list is sorted [expect false]: "+sorter.isSorted(list));
		System.out.println("list2 is sorted[expect true ]: "+sorter.isSorted(list2));
		
	}

}
