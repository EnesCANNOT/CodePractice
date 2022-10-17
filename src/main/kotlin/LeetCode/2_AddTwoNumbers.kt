package LeetCode

fun main() {
    val ln1 = ListNode(9)
    val ln2 = ListNode(9)

    var next = addTwoNumbers(ln1, ln2)?.next
    print(addTwoNumbers(ln1, ln2)?.`val`)
    while (next != null){
        print(next.`val`)
        next = next.next
    }

}

//var li = ListNode(5)
//var v = li.`val`

class ListNode(var `val`: Int){
    var next: ListNode? = null
}

fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {

    var l11 = l1
    var l22 = l2

    val dummyHead = ListNode(0)
    var curr = dummyHead
    var carry = 0

    while (l11 != null || l22 != null || carry != 0){
        val x = l11?.`val` ?: 0
        val y = l22?.`val` ?: 0
        val sum = carry + x + y
        carry = sum / 10
        curr.next = ListNode(sum % 10)
        curr = curr.next!!

        if (l11 != null)
            l11 = l11.next

        if (l22 != null)
            l22 = l22.next
    }

    return dummyHead.next
}