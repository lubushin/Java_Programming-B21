package day49_Abstarction;
interface X{
    void x();
}

interface Y extends X{
    void y();
}

interface  Z extends X, Y{
    void z();
}

    public interface InterfaceInheritance extends X,Y,Z{
void q();
    }

    class Practice implements InterfaceInheritance{

        @Override
        public void x() {

        }

        @Override
        public void y() {

        }

        @Override
        public void z() {

        }

        @Override
        public void q() {

        }
    }



