# Release notes

## 1.3.2

  * Updating plugin info.

Nimatron is currently obsolete since a JetBrains supported plugin for Nim has
just been released. These plugins do not work together. It is recommended here
that Nimatron be replaced with the JetBrains Nim plugin.

## 1.3.1

  * Lexer modified to suspend indents in bracketed content.
  * Lexer modified to suspend indents within conditional expressions.

## 1.3.0

  * Extensive work testing and improving parser.
  * Initial parse error recovery implemented.
  * Previous workarounds were replaced.
  * All outstanding issues resolved.

More work needs to be done on developing the parser. The current implementation
is significantly different from the way the Nim compiler handles indentation.
Most of the Nim grammar otherwise is fairly complete.

## 1.2.2

  * Lexer modified to ignore newlines in routine arguments.
  * Added support for d|D suffix for 64-bit floats in parser.
  * Grammar lookahead rules added, improves 'primarySuffix' rule.
  * Grammar workaround to allow import path expressions.
  * Grammar workaround to allow slash in operator function name.
  * Grammar workaround for object type member definition.

## 1.2.1

  * Correction to syntax highlighting for floats.

## 1.2.0

  * Significant re-working of grammar to fix parser issues.

## 1.1.1

  * Fix to grammar to parse multi-line arrays properly.

## 1.1.0

  * Added initial structure view showing routines.
  * Added initial code-folding of statements.

This is the first release with a fully-implemented Nim parser.

## 1.0.3

  * Replaced PNG file icon with SVG icon.
  * Added lexer support for discard-style block comment.

## 1.0.2

  * Minor update to include New Nim File action.

## 1.0.1

  * Added commenter action for line and block comments.

## 1.0

  * Basic syntax-highlighting.