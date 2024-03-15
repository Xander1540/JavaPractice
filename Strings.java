public class Strings {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Sander");

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'X');
        System.out.println(sb);

        sb.insert(6, 's');
        System.out.println(sb);

        sb.delete(6, 7);
        System.out.println(sb);

        //In append memory will not change.
        
        sb.append('\'');
        sb.append('s');
        sb.append(' ');
        sb.append('C');
        sb.append('a');
        sb.append('g');
        sb.append('e');
        System.out.println(sb);
    }
}
