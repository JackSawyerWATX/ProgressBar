public class Main{
    public static void main(String[] arg) throws Exception {
        String anim= "|/-\\";
        for (int x =0 ; x <= 20 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " Searching " + anim.charAt(x % anim.length());
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
        System.out.println();
        System.out.println("Components found!");
    }
}