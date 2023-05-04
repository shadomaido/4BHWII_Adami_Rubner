public class Main {
    public static void main(String[] args) {

        Office centralOffice = new Office();

        Monitor1 m1 = new Monitor1();
        Monitor2 m2 = new Monitor2();

        centralOffice.addSubscription(m1);
        centralOffice.addSubscription(m2);

        // PUSH
        centralOffice.setActualData(new Data(14.55, 76));

        // PULL
        m1.getData(new Data(18.90, 70));

    }
}