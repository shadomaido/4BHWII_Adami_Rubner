public class Monitor2 implements Subscriber{

    @Override
    public void getData(Data data) {
        System.out.println("The second Monitor outputs following data: " + data.getData());
    }
}
