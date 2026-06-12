public class Problem_151{

    public static String fun(String str){
        String word[]= str.split(" +");//any number of spaces

        StringBuilder sb= new StringBuilder();

        for(int i= word.length-1; i>=0 ; i--){
            sb.append(word[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
        
    }
    public static void main(String[] args) {
        String str= "The sky is blue";
        System.out.println(fun(str));
    }
}