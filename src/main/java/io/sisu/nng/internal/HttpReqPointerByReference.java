package io.sisu.nng.internal;

public class HttpReqPointerByReference extends PointerByReference {

    public HttpReqPointer getHttpReqPointer() {
        HttpReqPointer req = new HttpReqPointer();
        req.setPointer(getPointer().getPointer(0));
        return req;
    }
}
