package subtask4

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {

        val result = arrayListOf<String>()
        val stringBuilder = StringBuilder()

        for (i in inputString.indices) {
            if (inputString[i] == '<') {
                var countOpen = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '<') {
                        countOpen ++
                    }
                    if (inputString[j] == '>') {
                        countOpen --
                        if (countOpen == 0) {
                            result.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            }

            if (inputString[i] == '(') {
                var countOpen = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '(') {
                        countOpen ++
                    }
                    if (inputString[j] == ')') {
                        countOpen --
                        if (countOpen == 0) {
                            result.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            }

            if (inputString[i] == '[') {
                var countOpen = 1
                for (j in i + 1 until inputString.length) {
                    if (inputString[j] == '[') {
                        countOpen ++
                    }
                    if (inputString[j] == ']') {
                        countOpen --
                        if (countOpen == 0) {
                            result.add(stringBuilder.toString())
                            stringBuilder.clear()
                            break
                        }
                    }
                    stringBuilder.append(inputString[j])
                }
            }
        }
        return result.toTypedArray()
    }
}
}
