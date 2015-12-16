public class SWTry {

    public void doSmth() {
        String s = dangerous();
        System.out.println(s);
    }

    private String dangerous() throws RuntimeException {
        return "Not dangerous after all!";
    }
}
