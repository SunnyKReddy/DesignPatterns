package FacadeDesignPattern.FacadeDesignPattern1;

public class EC2ServerManagement implements ServerManagement{
    @Override
    public String getSSHKey(String serverIP) {
        return null;
    }

    @Override
    public boolean establishSSHConnection(String serverIP) {
        return false;
    }

    @Override
    public String getConnectionParameters(String serverIP) {
        return null;
    }

    @Override
    public boolean getHandShakeAck(String ServerIP) {
        return false;
    }

    @Override
    public boolean startServer(String serverIP) {
        System.out.println("Server connection established successfully!");
        return false;
    }

    @Override
    public String releaseSSHCOnnection(String serverIP) {
        return null;
    }

    @Override
    public String releaseConnectionParameters(String serverIP) {
        return null;
    }

    @Override
    public boolean releaseHandShakeAck(String serverIP) {
        return false;
    }

    @Override
    public boolean stopServer(String serverIP) {
        System.out.println("Server Stopped successfully!");
        return false;
    }

    @Override
    public String serverHealth(String serverIP) {
        System.out.println("Server is Healthy");
        return null;
    }

    @Override
    public String serverCPUMemoryStatus(String serverIP) {
        System.out.println("CPU & Memory utilizations are normal");
        return null;
    }
}
