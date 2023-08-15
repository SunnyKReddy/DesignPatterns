package FacadeDesignPattern.FacadeDesignPattern1;

import com.sun.security.ntlm.Server;

public class EC2ServerManagementFacade implements ServerManagementFacade{
    ServerManagement ec2ServerManagement = new EC2ServerManagement();
    public void connectToServer(){
        ec2ServerManagement.getSSHKey("1.1.1.1");
        ec2ServerManagement.establishSSHConnection("1.1.1.1");
        ec2ServerManagement.getConnectionParameters("1.1.1.1");
        ec2ServerManagement.getHandShakeAck("1.1.1.1");
        ec2ServerManagement.startServer("1.1.1.1");
    }

    public void healthOfServer(){
        ec2ServerManagement.serverHealth("1.1.1.1");
        ec2ServerManagement.serverCPUMemoryStatus("1.1.1.1");
    }

    public void disconnectFromServer(){
        ec2ServerManagement.releaseSSHCOnnection("1.1.1.1");
        ec2ServerManagement.releaseConnectionParameters("1.1.1.1");
        ec2ServerManagement.releaseHandShakeAck("1.1.1.1");
        ec2ServerManagement.stopServer("1.1.1.1");
    }
}
