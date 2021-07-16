# Java9
Demo project for Java9 features

1) Private methods in Interface
  
   Use :- The main purpose of Private methods in interface is code reusability. Private methods can be static or 
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
	- To remove warning @SafeVarargs came as part of Java 1.7 enchancement but only for static and final instance methods.
    - As part of Java 1.9 enchancement now @SafeVarargs can be annotated over private instance methods aswell.
	