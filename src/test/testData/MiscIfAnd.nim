if p.tok.tokType in {tkOpr, tkDotDot} and
  p.tok.strongSpaceB == 0 and
  p.tok.strongSpaceA > 0:
    result = true
