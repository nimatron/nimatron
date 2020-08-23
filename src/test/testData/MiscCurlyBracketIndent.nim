proc isOperator(tok: TToken): bool =
  tok.tokType in {tkOpr, tkDiv, tkMod, tkShl, tkShr, tkIn, tkNotin, tkIs,
                  tkIsnot, tkNot, tkOf, tkAs, tkFrom, tkDotDot, tkAnd,
                  tkOr, tkXor}
