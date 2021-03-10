package HWCollectionPractice;

public interface Test {
void readBook();
abstract void WatchTV();
}
abstract class B implements Test {
    public void ReadBook() {
        System.out.println("Reading Book");
    }

    public class C extends B {
        @Override
        public void readBook() {

        }

        @Override
        public void WatchTV() {

        }


    }
}
