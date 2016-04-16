class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        auto p1 = lower_bound(nums.begin(), nums.end(), target);
        
        auto p2 = upper_bound(nums.begin(), nums.end(), target);
        
        vector<int> res; res.clear();
        if(*p1 != target) {
            res.push_back(-1);
            res.push_back(-1);
            return res;
        }
        
        res.push_back(p1 - nums.begin());
        res.push_back(p2 - nums.begin() - 1);
        
        return res;
    }
};
