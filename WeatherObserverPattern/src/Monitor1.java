public class Monitor1 implements Subscriber{
    @Override
    public void getData(Data data) {
        System.out.println("The first Monitor outputs following data: " + data.getData());
    }
}
