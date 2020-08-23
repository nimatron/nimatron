proc prettyTok*(tok: TToken): string =
  if isKeyword(tok.tokType): result = "keyword " & tok.ident.s
  else: result = $tok
