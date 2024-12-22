

# ChunkSize

Maximum length of each chunk after the document is split (in tokens)

## anyOf schemas
* [Integer](Integer.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.ChunkSize;
import it.baccan.cheshirecat.model.Integer;

public class Example {
    public static void main(String[] args) {
        ChunkSize exampleChunkSize = new ChunkSize();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set ChunkSize to Integer
        exampleChunkSize.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleChunkSize.getActualInstance();
    }
}
```


