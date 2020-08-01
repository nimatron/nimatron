type       # the error appears in this "=" symbol
  Offsets = tuple[lPlayer: ByteAddress, fJump: ByteAddress, flags: ByteAddress]
  Values = tuple[localPlayer: ByteAddress, gameModule: ByteAddress, flag: byte]