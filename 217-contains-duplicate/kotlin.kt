class Solution {
    //Hash Set
    //TC - o(n)
    //SC - o(n)
    fun containsDuplicate1(nums: IntArray): Boolean {
        var hashSet = HashSet<Int>()
        for (item in nums) {
            if(hashSet.contains(item)) {
              return true
            }
            hashSet.add(item);
        }
        return false
    }

    //Sort and Loop
    //TC - o(n log n)
    //SC - o(1)
    fun containsDuplicate2(nums: IntArray): Boolean {
        val sorted = nums.sortedArray();
        for (i in 0..sorted.size) {
            if(i === sorted.size - 1) {
                return false;
            } else if(sorted[i] === sorted[i+1]) {
                return true;
            }
        }
        return false
    }

    //Built In Set
    //TC - o(n)
    //SC - o(n)
    fun containsDuplicate3(nums: IntArray) = nums.size > nums.toSet().size
}