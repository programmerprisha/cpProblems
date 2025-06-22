class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int kids = 0;
        int cookies = 0; 

        Arrays.sort(s);
        Arrays.sort(g);

        while(kids < g.length && cookies < s.length){
            if(s[cookies] >= g[kids]){
                kids++;
            }
            cookies++;
        }

        return kids;
    }
}
