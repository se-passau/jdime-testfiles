public class SWTry {

    public void doSmth() {
        String s = dangerous();
    }

    private String dangerous() throws RuntimeException {
        return "Not dangerous after all!";
    }
}
