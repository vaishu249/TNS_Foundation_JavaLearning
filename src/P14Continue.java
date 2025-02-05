public class P14Continue {
    public static void main(String[] args) {
        int i=10;
        for (int j = i; j <20 ; j++) {
            if(j%2==0){
                continue;
            }
            System.out.println(j);
        }
    }
}
