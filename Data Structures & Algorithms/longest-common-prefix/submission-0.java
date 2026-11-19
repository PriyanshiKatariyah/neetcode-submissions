class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int n = Math.min(first.length(), last.length());

        for(int i=0; i<n; i++) {
            if(first.charAt(i) != last.charAt(i)) {
                return first.substring(0, i);
            }
        }

        return first;
        

        //or


        // Arrays.sort(strs);

        // String first = strs[0];
        // String last = strs[strs.length - 1];
        // String ans = "";

        // for(int i=0; i<first.length(); i++) {
        //     if(first.charAt(i) != last.charAt(i)) break;

        //     ans += first.charAt(i);
        // }

        // return ans;


        //or


        // Arrays.sort(strs);

        // String first = strs[0];
        // String last = strs[strs.length - 1];
        
        // StringBuilder ans = new StringBuilder();

        // for(int i = 0; i < first.length(); i++) {
        //     if(first.charAt(i) != last.charAt(i)) break;

        //     ans.append(first.charAt(i));
        // }

        // return ans.toString();
    }
}

//O(n * mlogm), O(1)