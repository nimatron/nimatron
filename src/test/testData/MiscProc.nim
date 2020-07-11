proc foo[T](bar: proc (x, y: T): int = system.cmp, baz: int) =
  echo "1"
