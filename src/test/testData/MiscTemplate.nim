template sameOrNoInd(p): bool = p.tok.indent == p.currInd or p.tok.indent < 0