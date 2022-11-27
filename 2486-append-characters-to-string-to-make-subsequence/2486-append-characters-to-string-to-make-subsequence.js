/**
 * @param {string} s
 * @param {string} t
 * @return {number}
 */
var appendCharacters = function(s, t) {
    let tPointer = 0, sPointer = 0;
    while(sPointer < s.length){
        if(s[sPointer] === t[tPointer]){
            tPointer++;
            sPointer++;
        }
        else{
            sPointer++;
        }
    }
    return t.length - tPointer;
};