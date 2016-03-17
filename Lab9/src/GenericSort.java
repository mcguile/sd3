import java.util.Comparator;
import java.util.function.BiPredicate;


public class GenericSort<E> {
	
	// Part 5
	public void insertionSort(E[] list,Comparator<E> comp){
		for (int i=0; i < list.length; i++) {
		    /* Insert a[i] into the sorted sublist */
		    E v = list[i];
		    int j;
		    for (j = i - 1; j >= 0; j--) {
		        if (comp.compare(list[j], v) <= 0) break;
		        list[j + 1] = list[j];
		    }
		    list[j + 1] = v; }}

	// Part 6
	public void insertionSort(E[] list,BiPredicate<E,E> pred){
		for (int i=0; i < list.length; i++) {
		    /* Insert a[i] into the sorted sublist */
		    E v = list[i];
		    int j;
		    for (j = i - 1; j >= 0; j--) {
		        if (pred.test(list[j], v)) break;
		        list[j + 1] = list[j];
		    }
		    list[j + 1] = v; }}
	
}