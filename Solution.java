class Solution {
    public String mergeAlternately(String word1, String word2) {
         boolean w1;
                if ((word1).length()>(word2).length()){
                    w1=true;
                }
                else {
                    w1=false;
                }
                String s="";
                int max=0;
                if(w1==true){
                    max=(word2).length();
                }
                else{
                    max=(word1).length();
                }

                for (int i=0;i<max;i++){
                    s+=word1.substring(i,i+1)+word2.substring(i,i+1);
                }
                if (w1==true){
                    s+=word1.substring(max);

                }
                else{
                    s+=word2.substring(max);
                }
                return s;

}
}
