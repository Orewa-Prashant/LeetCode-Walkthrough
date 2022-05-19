class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<char,int> um;
        int maxi=0,l=0,i;
        for(i=0;s[i]!='\0';i++){
            if(!um.count(s[i]))
               um[s[i]]=i; 
            else {
                if(maxi<i-l)maxi=i-l;
                l=max(um[s[i]]+1,l);
                um[s[i]]=i; 
            }
        }
        if(maxi<i-l)maxi=i-l;
        return maxi;
    }
};