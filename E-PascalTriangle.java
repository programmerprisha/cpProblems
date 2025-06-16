class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        ArrayList<ArrayList<Integer>> numbers = new ArrayList<ArrayList<Integer>>();
        List<List<Integer>> nums = new ArrayList<>(numbers);

        for(int i = 1; i <= numRows; i++){
            List<Integer> rowList = new ArrayList<>();
                if(i == 1){
                    rowList.add(1);
                }
                else if(i == 2){
                    rowList.add(1);
                    rowList.add(1);
                }
                else{
                    rowList.add(1);
                    for(int k = 0; k < nums.get(i-2).size()-1; k++){

                        rowList.add(nums.get(i-2).get(k) + nums.get(i-2).get(k+1));
                    }
                    rowList.add(1);
                }
                nums.add(rowList);
        }

        return nums;
    }
}
