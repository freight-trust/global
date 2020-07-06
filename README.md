# Global Schema Registry

Schema registry global


## Overview

## Configuration

### XML namespace
```javascript
"xmlComplete.schemaMapping":
[
 {
  "xmlns": "https://github.com/freight-trust",
  "xsdUri": "https://freight-trust.s3.amazonaws.com/cdn/Schema.xsd",
  "strict": true // shows errors instead of tips
 }
]
```
### Using `schemaLocation` or `noNamespaceSchemaLocation` attribute directly in edited file
```xml
<root
...
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"https://freight-trust.s3.amazonaws.com/cdn/Schema.xsd"
xsi:noNamespaceSchemaLocation="https://freight-trust.s3.amazonaws.com/cdn/Schema.xsd"
/>
```

### Supported URI protocols

| Protocol  | Description                     | Example
|:---------:|:-------------------------------:|:---------------------------------:
| `data`    | XSD encoded directly in link    | `data:text/plain;base64,SGVsbG8sIFdvcmxkIQ%3D%3D`
| `file`    | XSD from local storage          | `file:///c:/windows/example.ini`
| `ftp`     | XSD from ftp server             | `ftp://ftp.kernel.org/pub/site/README`
| `http`    | XSD from http server            | `http://www.example.com/path/to/name`
| `https`   | XSD from https server           | `https://www.example.com/path/to/name`


## Examples

## License
MPL-2.0
Copyrights are owned by their respective owners
