

# MessageWhy

A class for encapsulating the context and reasoning behind a message, providing details on  input, intermediate steps, memory, and interactions with models.  Attributes ---------- input : str     The initial input message that triggered the response. intermediate_steps : List     A list capturing intermediate steps or actions taken as part of processing the message. memory : dict     A dictionary containing relevant memory information used during the processing of the message. model_interactions : List[Union[LLMModelInteraction, EmbedderModelInteraction]]     A list of interactions with language or embedding models, detailing how models were used in generating      or understanding the message context.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**input** | **String** |  |  |
|**intermediateSteps** | **List&lt;Object&gt;** |  |  |
|**memory** | **Object** |  |  |
|**modelInteractions** | [**List&lt;ModelInteractionsInner&gt;**](ModelInteractionsInner.md) |  |  |



