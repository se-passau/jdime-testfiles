public class SWTry {

    public void doSmth() {
        try {
            String s = dangerous();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    private String dangerous() throws RuntimeException {
        return "Not dangerous after all!";
    }
}
