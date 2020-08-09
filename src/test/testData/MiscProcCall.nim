proc call(f: proc(x: int): int) = echo f(1)

proc plusOne(a: int): int = return a + 1

call(plusOne)