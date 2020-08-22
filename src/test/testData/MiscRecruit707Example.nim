import ../base # Should comment this line to see the error


type Matrix3* {.raw.} = object
  data*: array[9, float32] # Should comment this line to see the error

func newMatrix3*(m0, m3, m6, m1, m4, m7, m2, m5, m8: float32): Matrix3 =
  result.data[0] = m0
  result.data[3] = m3
  result.data[6] = m6

  result.data[1] = m1
  result.data[4] = m4
  result.data[7] = m7

  result.data[2] = m2
  result.data[5] = m5
  result.data[8] = m8

func identityMatrix3*(): Matrix3 =
  result.data[0] = 1'f
  result.data[4] = 1'f
  result.data[8] = 1'f
#[
func identityMatrix3*(): Matrix3 =
  result.data[0] = 1'f
  result.data[4] = 1'f
  result.data[8] = 1'f
]#
{.push inline.}
func printf*(mat: Matrix3) =
  printf("[[%f, %f, %f],\n", mat.data[0], mat.data[3], mat.data[6])
  printf(" [%f, %f, %f],\n", mat.data[1], mat.data[4], mat.data[7])
  printf(" [%f, %f, %f]]\n", mat.data[2], mat.data[5], mat.data[8])

func `+`*(a, b: Matrix3): Matrix3 =
  result.data[0] = a.data[0] + b.data[0]
  result.data[3] = a.data[3] + b.data[3]
  result.data[6] = a.data[6] + b.data[6]

  result.data[1] = a.data[1] + b.data[1]
  result.data[4] = a.data[4] + b.data[4]
  result.data[7] = a.data[7] + b.data[7]

  result.data[2] = a.data[2] + b.data[2]
  result.data[5] = a.data[5] + b.data[5]
  result.data[8] = a.data[8] + b.data[8]

func `+=`*(a: var Matrix3, b: Matrix3) =
  a = a + b

func `-`*(a, b: Matrix3): Matrix3 =
  result.data[0] = a.data[0] - b.data[0]
  result.data[3] = a.data[3] - b.data[3]
  result.data[6] = a.data[6] - b.data[6]

  result.data[1] = a.data[1] - b.data[1]
  result.data[4] = a.data[4] - b.data[4]
  result.data[7] = a.data[7] - b.data[7]

  result.data[2] = a.data[2] - b.data[2]
  result.data[5] = a.data[5] - b.data[5]
  result.data[8] = a.data[8] - b.data[8]

func `-=`*(a: var Matrix3, b: Matrix3) =
  a = a - b

func `*`*(a, b: Matrix3): Matrix3 =
  result.data[0] = a.data[0] * b.data[0] + a.data[3] * b.data[1] + a.data[6] * b.data[2]
  result.data[3] = a.data[0] * b.data[3] + a.data[3] * b.data[4] + a.data[6] * b.data[5]
  result.data[6] = a.data[0] * b.data[6] + a.data[3] * b.data[7] + a.data[6] * b.data[8]

  result.data[1] = a.data[1] * b.data[0] + a.data[4] * b.data[1] + a.data[7] * b.data[2]
  result.data[4] = a.data[1] * b.data[3] + a.data[4] * b.data[4] + a.data[7] * b.data[5]
  result.data[7] = a.data[1] * b.data[6] + a.data[4] * b.data[7] + a.data[7] * b.data[8]

  result.data[2] = a.data[2] * b.data[0] + a.data[5] * b.data[1] + a.data[8] * b.data[2]
  result.data[5] = a.data[2] * b.data[3] + a.data[5] * b.data[4] + a.data[8] * b.data[5]
  result.data[8] = a.data[2] * b.data[6] + a.data[5] * b.data[7] + a.data[8] * b.data[8]

func `*`*(a: Matrix3, s: float32): Matrix3 =
  result.data[0] = a.data[0] * s
  result.data[3] = a.data[3] * s
  result.data[6] = a.data[6] * s

  result.data[1] = a.data[1] * s
  result.data[4] = a.data[4] * s
  result.data[7] = a.data[7] * s

  result.data[2] = a.data[2] * s
  result.data[5] = a.data[5] * s
  result.data[8] = a.data[8] * s

func `*=`*(a: var Matrix3, b: Matrix3) =
  a = a * b

func `*=`*(a: var Matrix3, s: float32) =
  a = a * s
{.pop.}

#[
func `/`*(a, b: Matrix3): Matrix3 =
  result.data[0] = a.data[0] / b.data[0]
  result.data[3] = a.data[3] / b.data[3]
  result.data[6] = a.data[6] / b.data[6]

  result.data[1] = a.data[1] / b.data[1]
  result.data[4] = a.data[4] / b.data[4]
  result.data[7] = a.data[7] / b.data[7]

  result.data[2] = a.data[2] / b.data[2]
  result.data[5] = a.data[5] / b.data[5]
  result.data[8] = a.data[8] / b.data[8]

func `/=`*(a: var Matrix3, b: Matrix3) =
  a = a / b
{.pop.}
]#
