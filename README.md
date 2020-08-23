# Nimatron

IntelliJ Platform plugin for the Nim programming language.

## Known Issues

### Nim indents in unusual places

This might be a limitation in the possible implementation using Grammar-Kit and JFlex. Tokens returned by JFlex don't
have any additional info. It would be useful to be able to add the indentation level to each token as Nim does. This
seems to allow a certain flexibility in places that may not be possible to replicate.

An example of indentation in Nim source which allows implicit indents within an 'if' condition.

```nim
if p.tok.tokType in {tkOpr, tkDotDot} and
  p.tok.strongSpaceB == 0 and
  p.tok.strongSpaceA > 0:
    result = true
```
