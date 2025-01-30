

# Text

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.Text;
import it.baccan.cheshirecat.model.Object;
import it.baccan.cheshirecat.model.String;

public class Example {
    public static void main(String[] args) {
        Text exampleText = new Text();

        // create a new Object
        Object exampleObject = new Object();
        // set Text to Object
        exampleText.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleText.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Text to String
        exampleText.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleText.getActualInstance();
    }
}
```


