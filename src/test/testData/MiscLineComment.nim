const
  EndOfFile* = '\0'           # end of file marker
                              # A little picture makes everything clear :-)
                              #  buf:
                              #  "Example Text\n ha!"   bufLen = 17
                              #   ^pos = 0     ^ sentinel = 12
                              #
  NewLine* = CR
