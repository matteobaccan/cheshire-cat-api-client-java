

# Value

## anyOf schemas
* [List<Object>](List<Object>.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.Value;
import it.baccan.cheshirecat.model.List<Object>;
import it.baccan.cheshirecat.model.Object;

public class Example {
    public static void main(String[] args) {
        Value exampleValue = new Value();

        // create a new List<Object>
        List<Object> exampleList<Object> = new List<Object>();
        // set Value to List<Object>
        exampleValue.setActualInstance(exampleList<Object>);
        // to get back the List<Object> set earlier
        List<Object> testList<Object> = (List<Object>) exampleValue.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set Value to Object
        exampleValue.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleValue.getActualInstance();
    }
}
```


