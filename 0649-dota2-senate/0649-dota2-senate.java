class Solution {
    public String predictPartyVictory(String senate) {
        Queue<Integer> R = new LinkedList<>();
        Queue<Integer> D = new LinkedList<>();

        int n= senate.length();

        for(int i=0;i<senate.length();i++){
            char ch = senate.charAt(i);

            if(ch=='R') R.add(i);
            if(ch=='D') D.add(i);
        }

        while (!R.isEmpty() && !D.isEmpty()){

            int indofR = R.poll();
            int indofD = D.poll();

            if(indofR < indofD) R.add(indofD+n);
            else D.add(indofR+n);

        }
        return R.isEmpty() ? "Dire": "Radiant";
        
    }
}