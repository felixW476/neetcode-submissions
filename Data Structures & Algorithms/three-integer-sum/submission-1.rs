impl Solution {
    pub fn three_sum(mut nums: Vec<i32>) -> Vec<Vec<i32>> {
        let mut v: Vec<Vec<i32>> = Vec::new();
        let n =  nums.len();

        nums.sort();

    for i in 0..n {
        if i > 0 && nums[i] == nums[i-1] { //skips duplicates
            continue;
        }
        let mut j = i + 1;
        let mut k = nums.len() -1;
        while j < k  { 
            if nums[i] + nums[j] + nums[k] < 0 {
                j += 1;
            } else if nums[i] + nums[j] + nums[k] > 0 {
                k -= 1; 
            } else {
                v.push(vec![nums[i], nums[j], nums[k]]);
                while j < k && nums[j] == nums[j+1]  {
                    j+=1;
                }
                while j < k && nums[k] == nums[k-1] {
                    k-=1;
                }
                j+=1;
                k-=1;
            }
        }
    }
        v
    }
}


