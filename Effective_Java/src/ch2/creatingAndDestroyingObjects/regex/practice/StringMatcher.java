/**
 * 
 */
package ch2.creatingAndDestroyingObjects.regex.practice;

/**
 * @author HAGOS
 *
 */
public class StringMatcher {

	public static void main(String[] args) {
		
		System.out.println(isTrue("3.45"));

	}
	
	public static boolean isTrue(String s){
        return s.matches("^\\d+(\\.\\d+)?");
    }

}
