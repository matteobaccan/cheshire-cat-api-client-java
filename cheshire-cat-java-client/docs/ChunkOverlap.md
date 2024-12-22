

# ChunkOverlap

Chunk overlap (in tokens)

## anyOf schemas
* [Integer](Integer.md)

NOTE: this class is nullable.

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.ChunkOverlap;
import it.baccan.cheshirecat.model.Integer;

public class Example {
    public static void main(String[] args) {
        ChunkOverlap exampleChunkOverlap = new ChunkOverlap();

        // create a new Integer
        Integer exampleInteger = new Integer();
        // set ChunkOverlap to Integer
        exampleChunkOverlap.setActualInstance(exampleInteger);
        // to get back the Integer set earlier
        Integer testInteger = (Integer) exampleChunkOverlap.getActualInstance();
    }
}
```


