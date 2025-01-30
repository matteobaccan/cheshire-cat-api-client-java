

# Image

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.Image;
import it.baccan.cheshirecat.model.Object;
import it.baccan.cheshirecat.model.String;

public class Example {
    public static void main(String[] args) {
        Image exampleImage = new Image();

        // create a new Object
        Object exampleObject = new Object();
        // set Image to Object
        exampleImage.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleImage.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Image to String
        exampleImage.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleImage.getActualInstance();
    }
}
```


