fun customSortString(S: String, T: String): String {
    val arr = IntArray(26)

    T.forEach { c ->
        arr[c - 'a']++
    }

    val sb = StringBuilder()

    S.forEach { c ->
        for (i in 0 until arr[c - 'a']) {
            sb.append(c)
        }
        arr[c - 'a'] = 0
    }

    for (c in 'a'..'z') {
        for (i in 0 until arr[c - 'a']) {
            sb.append(c)
        }
    }
    return sb.toString()
}

fun main() {
    val s1 = "cba"
    val s2 = "abcd"

    println(customSortString(s1, s2))
}