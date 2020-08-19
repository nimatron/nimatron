import parseopt

block err1:
    var cmd_p = initOptParser("-t")
    while true:
        cmd_p.next()
        case cmd_p.kind
        of cmdEnd: break
        of cmdShortOption:
            if cmd_p.key == "t":
                echo "test: ", cmd_p.key
            else:  # ERROR: IND_EQ expected got ':'
                echo "argument not found"
        of cmdLongOption:
            discard
        of cmdArgument:
            discard

block err2:
    var cmd_p = initOptParser("-t")
    while true:
        cmd_p.next()
        case cmd_p.kind
        of cmdEnd: break
        of cmdShortOption, cmdLongOption:  # ERROR: ..or '(.' expected got ',' (only when above block is commented out)
            if cmd_p.key == "t":
                echo "test: ", cmd_p.key
            else:  # No error here
                echo "argument not found"
        of cmdArgument:
            discard

block err3:
    case "charlie":
      of "alfa":  # ERROR IND_EQ expected got ':'
        echo "A"
      of "bravo":
        echo "B"
      of "charlie":
        echo "C"
      else:
        echo "Unrecognized letter"