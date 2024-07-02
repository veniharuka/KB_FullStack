package afternoon.nested.nested.ex2;

public class NetWorkMain {
    public static void main(String[] args) {
        Network network = new Network();
        if(network.checkNetwork()){
            network.sendMsg("내일도 비 오려나?!");
        }
    }

}
