

# ModelInteractionsInner

## anyOf schemas
* [EmbedderModelInteraction](EmbedderModelInteraction.md)
* [LLMModelInteraction](LLMModelInteraction.md)

## Example
```java
// Import classes:
import it.baccan.cheshirecat.model.ModelInteractionsInner;
import it.baccan.cheshirecat.model.EmbedderModelInteraction;
import it.baccan.cheshirecat.model.LLMModelInteraction;

public class Example {
    public static void main(String[] args) {
        ModelInteractionsInner exampleModelInteractionsInner = new ModelInteractionsInner();

        // create a new EmbedderModelInteraction
        EmbedderModelInteraction exampleEmbedderModelInteraction = new EmbedderModelInteraction();
        // set ModelInteractionsInner to EmbedderModelInteraction
        exampleModelInteractionsInner.setActualInstance(exampleEmbedderModelInteraction);
        // to get back the EmbedderModelInteraction set earlier
        EmbedderModelInteraction testEmbedderModelInteraction = (EmbedderModelInteraction) exampleModelInteractionsInner.getActualInstance();

        // create a new LLMModelInteraction
        LLMModelInteraction exampleLLMModelInteraction = new LLMModelInteraction();
        // set ModelInteractionsInner to LLMModelInteraction
        exampleModelInteractionsInner.setActualInstance(exampleLLMModelInteraction);
        // to get back the LLMModelInteraction set earlier
        LLMModelInteraction testLLMModelInteraction = (LLMModelInteraction) exampleModelInteractionsInner.getActualInstance();
    }
}
```


