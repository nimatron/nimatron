import parseopt

case "charlie":
  of "alfa":  # ERROR IND_EQ expected got ':'
    echo "A"
  of "bravo":
    echo "B"
  of "charlie":
    echo "C"
  else:
    echo "Unrecognized letter"
