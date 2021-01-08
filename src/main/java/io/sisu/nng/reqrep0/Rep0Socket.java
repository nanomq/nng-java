package io.sisu.nng.reqrep0;

import io.sisu.nng.Message;
import io.sisu.nng.NngException;
import io.sisu.nng.Socket;
import io.sisu.nng.Nng;
import io.sisu.nng.internal.SocketStruct;

public class Rep0Socket extends Socket {

    public Rep0Socket() throws Exception {
        super(Nng.lib()::nng_rep0_open);
    }
}
