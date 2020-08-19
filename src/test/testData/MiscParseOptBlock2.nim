import parseopt

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
