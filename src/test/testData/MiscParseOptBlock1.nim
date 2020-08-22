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
