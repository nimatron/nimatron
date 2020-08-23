type
  TCallingConvention* = enum
    ccDefault,
    ccStdCall,
    ccCDecl,
    ccSafeCall,
    ccSysCall,
    ccInline,
    ccNoInline,
    ccFastCall,
    ccThisCall,
    ccClosure,
    ccNoConvention
