//Hash Set
//TC - o(n)
//SC - o(n)
function containsDuplicate1(nums) {
    const set = new Set();

    for(let i=0; i < nums.length; i++) {
        if(set.has(nums[i])) {
            return true
        }

        set.add(nums[i]);
    }

    return false;
};

//Sort and Loop
//TC - o(n log n)
//SC - o(1)
function containsDuplicate2(nums) {
    nums.sort();

    for(let i=0; i < nums.length; i++) {
        if(i === nums.length - 1) {
            return false;
        } else if(nums[i] === nums[i+1]) {
            return true;
        }
    }
};

//Built In Set
//TC - o(n)
//SC - o(n)
function containsDuplicate3(nums) {
    const set = new Set(nums);
    return nums.length > set.size;
};