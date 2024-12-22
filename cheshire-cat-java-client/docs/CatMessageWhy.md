

# CatMessageWhy

## anyOf schemas
* [MessageWhy](MessageWhy.md)
* [Object](Object.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.CatMessageWhy;
import it.baccan.cheshirecat.model.MessageWhy;
import it.baccan.cheshirecat.model.Object;

public class Example {
    public static void main(String[] args) {
        CatMessageWhy exampleCatMessageWhy = new CatMessageWhy();

        // create a new MessageWhy
        MessageWhy exampleMessageWhy = new MessageWhy();
        // set CatMessageWhy to MessageWhy
        exampleCatMessageWhy.setActualInstance(exampleMessageWhy);
        // to get back the MessageWhy set earlier
        MessageWhy testMessageWhy = (MessageWhy) exampleCatMessageWhy.getActualInstance();

        // create a new Object
        Object exampleObject = new Object();
        // set CatMessageWhy to Object
        exampleCatMessageWhy.setActualInstance(exampleObject);
        // to get back the Object set earlier
        Object testObject = (Object) exampleCatMessageWhy.getActualInstance();
    }
}
```


