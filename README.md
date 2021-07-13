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
   
