class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        return s.toList().sorted().joinToString("") == t.toList().sorted().joinToString("")
    }

    //More performant
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()

        for (i in 0 until s.length) {
            sMap[s[i]] = 1 + (sMap[s[i]] ?: 0)
            tMap[t[i]] = 1 + (tMap[t[i]] ?: 0)
        }

        return !sMap.keys.any { key -> sMap[key] != tMap[key] }

        // another way to compare maps
        // return sMap == tMap
    }
}