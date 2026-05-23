impl Solution {
    pub fn is_palindrome(s: String) -> bool {
        let chars: Vec<char> = s.to_lowercase()
                                .chars()
                                .filter(|c| c.is_alphanumeric()) // catch special character
                                .collect();
        let mut left = 0;
        let mut right = chars.len() - 1;

        if chars.is_empty() {
            return true;
        }

        while left < right {
            if chars[left] != chars[right] {
                return false;
            }
            left +=1;
            right -=1;
        }

       true
    }

}