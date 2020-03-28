package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        if (sadArray.size<3)
            return sadArray
        else {
            var endOfArray = sadArray.size - 3
            val NewMList = sadArray.toMutableList()
            var checkstate = false
            while (!checkstate){
                checkstate = true

                for (i in 0..endOfArray){
                    if(NewMList[i] + NewMList[i+2] < NewMList[i+1]){
                        NewMList.removeAt(i+1)
                        checkstate = false
                        endOfArray-=1
                        break
                    }
                }
            }

            return NewMList.toIntArray()


        }


    }
}
