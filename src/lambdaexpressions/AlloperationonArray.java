package lambdaexpressions;
import java.util.stream.*;
import java.util.*;
public class AlloperationonArray {

	public static void main(String[] args) {
		Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//		// Convert Array to Stream
//		List<Integer> numberList = Arrays.stream(numbers).collect(Collectors.toList());
//		System.out.println("List: " + numberList);
//
//		// Collect even numbers into a Set
//		Set<Integer> evenSet = Arrays.stream(numbers)
//				.filter(n -> n % 2 == 0)
//				.collect(Collectors.toSet());
//		System.out.println("Even Set: " + evenSet);
//
//		// Create a Map with numbers as keys and their squares as values
//		Map<Integer, Integer> numberSquareMap = Arrays.stream(numbers)
//				.collect(Collectors.toMap(n -> n, n -> n * n));
//		System.out.println("Number-Square Map: " + numberSquareMap);
//
//		// Join numbers into a String separated by ", "
//		String joinedNumbers = Arrays.stream(numbers)
//				.map(String::valueOf)
//				.collect(Collectors.joining(", "));
//		System.out.println("Joined Numbers: " + joinedNumbers);
//
//		// Group numbers by odd or even
//		Map<Boolean, List<Integer>> oddEvenPartition = Arrays.stream(numbers)
//				.collect(Collectors.partitioningBy(n -> n % 2 == 0));
//		System.out.println("Odd-Even Partition: " + oddEvenPartition);
//
//		// Count the number of elements
//		long count2 = Arrays.stream(numbers).count();
//		System.out.println("Count: " + count2);
//		long count = Arrays.stream(numbers).collect(Collectors.counting());
//		System.out.println("Count: " + count);
//
//		// Summarize statistics such as count, sum, min, max, and average
//		IntSummaryStatistics stats = Arrays.stream(numbers).collect(Collectors.summarizingInt(n -> n));
//		System.out.println("Statistics: " + stats);
//
//		// Find the minimum number in the array
//		Optional<Integer> min = Arrays.stream(numbers).min((n1,n2)-> n1.compareTo(n2));
////		Optional<Integer> minNumber = Arrays.stream(numbers).collect(Collectors.minBy(Integer::compareTo));
//		TreeSet<Integer> t=new TreeSet<>(Integer::compareTo);
////		minNumber.ifPresent(min -> System.out.println("Min Number: " + min));
		
		
//
//		// Find the maximum number in the array
//		Optional<Integer> maxNumber = Arrays.stream(numbers).collect(Collectors.maxBy(Integer::compareTo));
//		maxNumber.ifPresent(max -> System.out.println("Max Number: " + max));
//
//		// Apply a mapping function to square each number and collect into a list
//		List<Integer> squares = Arrays.stream(numbers)
//				.collect(Collectors.mapping(n -> n * n, Collectors.toList()));
//		System.out.println("Squares: " + squares);
//
//		// Collect into an unmodifiable list using collectingAndThen
		List<Integer> unmodifiableList = Arrays.stream(numbers)
				.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		System.out.println("Unmodifiable List: " + unmodifiableList);
	}
}


