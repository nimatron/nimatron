type
  TErrorHandler* = proc (conf: ConfigRef; info: TLineInfo; msg: TMsgKind; arg: string)
