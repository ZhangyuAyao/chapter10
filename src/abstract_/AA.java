package abstract_;

public class AA extends Template {

    public void job() {
        int num = 0;
        for (int i = 1; i <= 880000; i++) {
            num += i;
        }
    }
}
