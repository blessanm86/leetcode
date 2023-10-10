//Double Loop and Maps
var isAnagram1 = function(s, t) {
    return s.split('').sort().join('') === t.split('').sort().join('');
};

//Double Loop and Maps
//TC - o(S+T)
//SC - o(S+T)
//More performant as sorting can take more memory
var isAnagram2 = function(s, t) {
    if(s.length !== t.length) return false;

    const sMap ={};
    const tMap = {};

    for(let i=0; i<s.length; i++) {
        sMap[s[i]] = 1 + (sMap[s[i]] ?? 0);
        tMap[t[i]] = 1 + (tMap[t[i]] ?? 0);
    }

    return !Object.keys(sMap).some(key => sMap[key] !== tMap[key]);
};