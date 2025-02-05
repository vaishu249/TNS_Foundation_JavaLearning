public class P15Switch {
    public static void main(String[] args) {
        char x='b';
        String lang=switch (x) {
            case 'a'->"Angular";
            case 'b'->"Bootstrap";
            case 'c'->"C++";
            default -> "Wrong Choice";
        };
        System.out.println(lang);
    }
}
