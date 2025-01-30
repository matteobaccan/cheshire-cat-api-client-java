

# Audio

## anyOf schemas
* [Object](Object.md)
* [String](String.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.Audio;
import it.baccan.cheshirecat.model.Object;
import it.baccan.cheshirecat.model.String;

public class Example {
    public static void main(String[] args) {
        Audio exampleAudio = new Audio();

        // create a new Object
        Object exampleObject = new Object();
        // set Audio to Object
        exampleAudio.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleAudio.getActualInstance();

        // create a new String
        String exampleString = new String();
        // set Audio to String
        exampleAudio.setActualInstance(exampleString);
        // to get back the String set earlier
        String testString = (String) exampleAudio.getActualInstance();
    }
}
```


