package com.lrn.nettymysqlprotocol.transcoder;

import com.lrn.nettymysqlprotocol.DefaultServerHandler;
import com.lrn.nettymysqlprotocol.protocol.Capabilities;
import com.lrn.nettymysqlprotocol.protocol.ServerStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TranscoderContext {
    public static final Logger logger = LoggerFactory.getLogger(TranscoderContext.class);
    
    protected Capabilities capabilities = new Capabilities();

    protected ServerStatus serverStatus = new ServerStatus();

    protected Class phase = AuthPhase.class;

    public Capabilities getCapabilities() {
        return capabilities;
    }

    public void setCapabilities(Capabilities capabilities) {
        this.capabilities = capabilities;
    }

    public ServerStatus getServerStatus() {
        return serverStatus;
    }

    public void setServerStatus(ServerStatus serverStatus) {
        this.serverStatus = serverStatus;
    }

    public boolean isAuthPhase() {
        return this.phase == AuthPhase.class;
    }

    public boolean isCommandPhase() {
        return this.phase == CommandPhase.class;
    }

    public void setAuthPhase() {
        this.phase = AuthPhase.class;
    }

    public void setCommandPhase() {
        this.phase = CommandPhase.class;
    }


    public static class AuthPhase {

    }

    public static class CommandPhase {

    }
}
