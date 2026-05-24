impl Solution {
    pub fn two_sum(numbers: Vec<i32>, target: i32) -> Vec<i32> {
        let mut v: Vec<i32> = Vec::new();
        let n = numbers.len();
        let mut end = n - 1 ;
        let mut start = 0;

        while start < end {
            if numbers[start] + numbers[end] > target {
                end = end - 1;
            } else if numbers[start] + numbers[end] < target {
                start = start + 1;
            } else {
                v.push((start + 1) as i32);
                v.push((end + 1) as i32);
                break;
            }
        }
        
        v
    }
}
