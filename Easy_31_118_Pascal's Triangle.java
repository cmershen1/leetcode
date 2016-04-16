public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<List<Integer>>();
        for(int i=0;i<numRows;i++) {
            List<Integer> line=new ArrayList<Integer>();
            for(int j=0;j<=i;j++)
                line.add((j==0||j==i)?1:triangle.get(i-1).get(j-1)+triangle.get(i-1).get(j));
            triangle.add(line);
        }
        return triangle;
    }
}
