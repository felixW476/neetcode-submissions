use std::cmp;

impl Solution {
    pub fn trap(height: Vec<i32>) -> i32 {
        let mut prefix = vec![0; height.len()]; 
        let mut suffix = vec![0; height.len()]; 
        let mut max =  height[height.len()-1];
        let mut total = 0;
        

        // prefix maxium
        prefix[0] = height[0]; 
        max = height[0]; 
        for i in 1..height.len() { // [1, 1, 5, 5, 5]
        if height[i] > max {
            max = height[i];
        }
        prefix[i] = max;
        }

        max = height[height.len()-1];
        // suffix max
        suffix[height.len()-1] = height[height.len()-1];
        for i in (0..height.len()-1).rev() {
        if height[i] > max {
            max = height[i];
        }
        suffix[i] = max;
        }


        for i in 0..height.len() {
            let water = cmp::min(prefix[i], suffix[i]) - height[i];
            total+= water;
        }

        total
        
    }
}
