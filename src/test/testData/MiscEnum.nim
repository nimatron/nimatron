type
  TCallingConvention* = enum
    ccDefault,                # proc has no explicit calling convention
    ccStdCall,                # procedure is stdcall
    ccCDecl,                  # cdecl
    ccSafeCall,               # safecall
    ccSysCall,                # system call
    ccInline,                 # proc should be inlined
    ccNoInline,               # proc should not be inlined
    ccFastCall,               # fastcall (pass parameters in registers)
    ccThisCall,               # thiscall (parameters are pushed right-to-left)
    ccClosure,                # proc has a closure
    ccNoConvention            # needed for generating proper C procs sometimes
