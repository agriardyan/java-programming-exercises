package com.mitrais.cdc.java.three;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FunctionUtils2 {
	
  @SafeVarargs
  public static <T> Predicate<T> anyPassPredicate(Predicate<T>... tests) {
    Predicate<T> result = e -> false;

    
    /** TODO: create a 'for' loop. 
     * 	Returns a Predicate that is the result of ORing all the argument Predicates.
     *  If no Predicates are supplied, it returns a Predicate that always returns
     *  false.
     */
    

    
    
    
    
    return(result);
  }
  
  
  
  @SafeVarargs
  public static <T> T firstAnyMatch(Stream<T> elements, Predicate<T>... tests) {
    Predicate<T> combinedTest = anyPassPredicate(tests);
    
    T result = null;
    
    //TODO: filter based first element that matches ANY of the tests, null otherwise
    
    
    
    
    
    return result;
  }
  
  private FunctionUtils2() {} // Uninstantiatable class
}
