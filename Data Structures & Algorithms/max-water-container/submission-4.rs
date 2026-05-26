use std::cmp;

impl Solution {
    pub fn max_area(heights: Vec<i32>) -> i32 {
        let mut width: i32;
        let mut length: i32;
        let mut area: i32;

        let mut max: i32 = 0;

        for i in 0..heights.len() {
            let mut count = 1;
            for j in i+1..heights.len() {
                // println!("{} {}", heights[i], heights[j]);
                length = cmp::min(heights[i], heights[j]);
                width = count as i32;
                count+=1;
                area = length * width;

                if area > max {
                    max = area;
                }


               // println!("length:{} width:{}", length, width);
               // println!("{}", area);
            }
        }

        max

    }
}
