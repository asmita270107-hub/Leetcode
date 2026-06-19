

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> li = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i) {
                    li.add(1);
                } else {

                    // Get previous row
                    List<Integer> previousRow = row.get(i - 1);

                
                    int value = previousRow.get(j - 1)
                              + previousRow.get(j);

                    li.add(value);
                }
            }

            row.add(li);
        }

        return row;
    }
}