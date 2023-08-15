package FacadeDesignPattern.FacadeDesignPattern1;

public interface ServerManagement {
    //connecting to server
    public String getSSHKey(String serverIP);
    public boolean establishSSHConnection(String serverIP);
    public String getConnectionParameters(String serverIP);
    public boolean getHandShakeAck(String ServerIP);
    public boolean startServer(String serverIP);

    //disconnecting from server
    public String releaseSSHCOnnection(String serverIP);
    public String releaseConnectionParameters(String serverIP);
    public boolean releaseHandShakeAck(String serverIP);
    public boolean stopServer(String serverIP);

    //Server health Status
    public String serverHealth(String serverIP);
    public String serverCPUMemoryStatus(String serverIP);
}
