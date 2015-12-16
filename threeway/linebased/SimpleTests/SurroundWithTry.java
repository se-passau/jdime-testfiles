public class SWTry {

    public void doSmth() {
<<<<<<< .\threeway\left\SimpleTests\SurroundWithTry.java
        try {
            String s = dangerous();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
=======
        String s = dangerous();
        System.out.println(s);
>>>>>>> .\threeway\right\SimpleTests\SurroundWithTry.java
    }

    private String dangerous() throws RuntimeException {
        return "Not dangerous after all!";
    }
}
