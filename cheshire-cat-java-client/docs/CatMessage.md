

# CatMessage

Represents a Cat message.  Attributes ---------- type : str     The type of message. Defaults to \"chat\". user_id : str     Unique identifier for the user associated with the message. when : float     The timestamp when the message was sent. Defaults to the current time. who : str     The name of the message author. text : Optional[str], default=None     The text content of the message. image : Optional[str], default=None     Image file URLs or base64 data URIs that represent image associated with the message. audio : Optional[str], default=None     Audio file URLs or base64 data URIs that represent audio associated with the message. why : Optional[MessageWhy]     Additional contextual information related to the message.  Notes ----- - The `content` parameter and attribute are deprecated. Use `text` instead.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** |  |  |
|**when** | **BigDecimal** |  |  [optional] |
|**who** | **String** |  |  [optional] |
|**text** | [**Text**](Text.md) |  |  [optional] |
|**image** | [**Image**](Image.md) |  |  [optional] |
|**audio** | [**Audio**](Audio.md) |  |  [optional] |
|**type** | **String** |  |  [optional] |
|**why** | [**CatMessageWhy**](CatMessageWhy.md) |  |  [optional] |
|**content** | **String** | This attribute is deprecated. Use &#x60;text&#x60; instead.  The text content of the message. Use &#x60;text&#x60; instead.  Returns ------- str     The text content of the message. |  [readonly] |



