class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>> merged;
        
        //first we sort the vector so we have consecutive overlapping intervals
        sort(intervals.begin(),intervals.end());
        
        //now we use extra vector to store current element. this element will be compared with all vector elements. initially input first value
        vector<int> temp = intervals[0];
        for(auto it: intervals)
        {
            //if second of it is less than first of temp
            //we overlap the intervals
            if(temp[1]>=it[0])
            {
                temp[1]=max(temp[1],it[1]);
            }
            else
            {
                //if no overlap found we push the pair in vector and use current it as next pair
                merged.push_back(temp);
                temp=it;
            }
        }
        //now last one is left so push it also
        merged.push_back(temp);
        return merged;
    }
};
