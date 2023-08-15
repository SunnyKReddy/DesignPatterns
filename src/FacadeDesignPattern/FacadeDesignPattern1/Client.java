package FacadeDesignPattern.FacadeDesignPattern1;

public class Client {
    public static void main(String[] args) {

//        //-------------------************************-------------------------
//        //Implementing server Management code without facade design pattern
//        //connect to ec2 server
//        ServerManagement ec2ServerManagement = new EC2ServerManagement();
//        ec2ServerManagement.getSSHKey("1.1.1.1");
//        ec2ServerManagement.establishSSHConnection("1.1.1.1");
//        ec2ServerManagement.getConnectionParameters("1.1.1.1");
//        ec2ServerManagement.getHandShakeAck("1.1.1.1");
//        ec2ServerManagement.startServer("1.1.1.1");
//
//        //Server Health checks
//        ec2ServerManagement.serverHealth("1.1.1.1");
//        ec2ServerManagement.serverCPUMemoryStatus("1.1.1.1");
//
//        //disconnecting from  server
//        ec2ServerManagement.releaseSSHCOnnection("1.1.1.1");
//        ec2ServerManagement.releaseConnectionParameters("1.1.1.1");
//        ec2ServerManagement.releaseHandShakeAck("1.1.1.1");
//        ec2ServerManagement.stopServer("1.1.1.1");
//
//        //-------------------************************-------------------------

        //--------**********IMPLEMENTING FACADE DESIGN PATTERN**************-------------
        EC2ServerManagementFacade ec2ServerManagementFacade = new EC2ServerManagementFacade();
        ec2ServerManagementFacade.connectToServer();
        ec2ServerManagementFacade.healthOfServer();
        ec2ServerManagementFacade.disconnectFromServer();

    }
}
