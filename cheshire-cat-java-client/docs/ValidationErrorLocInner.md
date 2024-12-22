

# ValidationErrorLocInner

## anyOf schemas
* [Integer](Integer.md)
* [String](String.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.ValidationErrorLocInner;
import it.baccan.cheshirecat.model.Integer;
import it.baccan.cheshirecat.model.String;

public class Example {
    public static void main(String[] args) {
        ValidationErrorLocInner exampleValidationErrorLocInner = new ValidationErrorLocInner();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set ValidationErrorLocInner to Integer
        exampleValidationErrorLocInner.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleValidationErrorLocInner.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set ValidationErrorLocInner to String
        exampleValidationErrorLocInner.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleValidationErrorLocInner.getActualInstance();
    }
}
```


