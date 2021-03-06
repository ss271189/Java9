# Java9
Demo project for Java9 features

1) Private methods in Interface
  
   Use :- The main purpose of Private methods in interface is code re-usability. Private methods can be static or 
   non-static. Private methods both static and non-static are not accessible to the implementation class.
   
2) Try with Resource Enhancement
    
    Now we can use variable outside try scope in try with resource block. Earlier any resource with in try (resource)
    must be defined within try scope.
    Note** Any resource which needs to be written within try with resource must implement AutoClosable interface.
            We can have only try with resource block . No catch or finally block mandatory.
    Benefit : Cleaner code with Java 1.9.

3) Diamond Operator Enhancement

     Diamond operator came as part of Java 1.7 
     ArrayList<String> l=new ArrayList<>();   //<> is called as diamond operator
     
     Before Java 1.9, Diamond operator was not allowed with Anonymous class.
   
4) @SafeVarargs Enhancement as part of Java 1.9
     
	- Varargs came as part of Java 1.5 enhancement 
	- Varargs with generic parameter gives Heap Pollution problem (Class Cast Exception)
	- Complier gives warning to avoid Heap Pollution Problem
	- To remove warning @SafeVarargs came as part of Java 1.7 enhancement but only for static and final instance methods.
    - As part of Java 1.9 enhancement now @SafeVarargs can be annotated over private instance methods as-well.
	- Non Final instance method can't be annotated with @SafeVarargs because they can be over ridden by child class and That override might not be safe.

5) Factory Methods to create Unmodifiable Collection Objects

    - Method to create List
	    - List<String> list= List.of("A","B","C");
		- After creating list if we try to add or remove element it will give UnsupportedOperationException
        - Adding null element will result in NullPointerException.
		- Total 12 overloaded method for of().
		- It returns Object of ImmutableCollections$ListN. Static inner class of ImmutableCollections.	
	
    - Method to create Set
     	- Set<String> set= Set.of("A","B","C");
		- After creating Set if we try to add or remove element it will give UnsupportedOperationException.
		- Adding null element will result in NullPointerException.
		- Total 12 overloaded method.
		- Adding duplicate element to set will give IllegalArgumentException.
		- It returns Object of ImmutableCollections$SetN. Static inner class of ImmutableCollections;
		
	- Method to create Map
        - Map<String,String> mapNew= Map.of("A","Apple","B","Ball","C","Cat");	
		- After creating Map if we try to add or remove element it will give UnsupportedOperationException.
		- Adding NULL KEY or VALUE will result in NullPointerException.
		- Total 11 overloaded method. For more than 10 elements we should use Map.ofEntry() methods.
		- It returns Object of ImmutableCollections.MapN. Static Inner class of ImmutableCollections.
		
		
6) Stream API enchancement	

    - takeWhile() 
        - default method added to Stream interface.
        - take parameter as Predicate. 
        - loops over the list and breaks where the conditions become false.
		- Returns, if this stream is ordered, a stream consisting of the longest prefix of elements taken from this stream that match the given predicate. Otherwise returns, if this stream is unordered, a stream consisting of a subset of elements taken from this stream that match the given predicate.
          If this stream is ordered then the longest prefix is a contiguous sequence of elements of this stream that match the given predicate. The first element of the sequence is the first element of this stream, and the element immediately following the last element of the sequence does not match the given predicate.
          If this stream is unordered, and some (but not all) elements of this stream match the given predicate, then the behavior of this operation is nondeterministic; it is free to take any subset of matching elements (which includes the empty set).
          Independent of whether this stream is ordered or unordered if all elements of this stream match the given predicate then this operation takes all elements (the result is the same as the input), or if no elements of the stream match the given predicate then no elements are taken (the result is an empty stream).
        - List<Integer> newList=list.stream()
                                     .takeWhile(x-> x%2==0)
                                     .collect(Collectors.toList());
	        O/P ->  New modified list [2, 4]
			
	- dropWhile()
        - default method added to Stream interface.	
		- takes parameter as Predicate.
		- Returns, if this stream is ordered, a stream consisting of the remaining elements of this stream after dropping the longest prefix of elements that match the given predicate. Otherwise returns, if this stream is unordered, a stream consisting of the remaining elements of this stream after dropping a subset of elements that match the given predicate.
          If this stream is ordered then the longest prefix is a contiguous sequence of elements of this stream that match the given predicate. The first element of the sequence is the first element of this stream, and the element immediately following the last element of the sequence does not match the given predicate.
          If this stream is unordered, and some (but not all) elements of this stream match the given predicate, then the behavior of this operation is nondeterministic; it is free to drop any subset of matching elements (which includes the empty set).
          Independent of whether this stream is ordered or unordered if all elements of this stream match the given predicate then this operation drops all elements (the result is an empty stream), or if no elements of the stream match the given predicate then no elements are dropped (the result is the same as the input).
		- List<Integer> list=List.of(2,4,3,5,6,8);
		  List<Integer> newList1=list.stream()
                                     .dropWhile(x-> x%2==0)
                                     .collect(Collectors.toList());
									 
			O/P -> New modified list [3, 5, 6, 8]	
			
    - Stream.iterate()		
		- Stream.iterate() method got added in Java 1.8 only (But with 2 parameter , public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
		- In 1.9, overloaded static method got added which take three parameter.
		- public static<T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next)
        - Works same as for loop initialization , condition check and function to change the value.

    - Steam.ofNullable
	
        - Static method got addded as part of 1.9 enhancement.
        - Returns a sequential Stream containing a single element, if non-null, otherwise returns an empty Stream.
        - public static<T> Stream<T> ofNullable(T t)		
		
			
			

















	
	
	