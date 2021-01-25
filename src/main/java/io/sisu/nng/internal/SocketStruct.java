package io.sisu.nng.internal;

import com.sun.jna.Structure;

@Structure.FieldOrder({ "id" })
public class SocketStruct extends Structure {
    public int id;

    public ByValue byValue() {
        return new ByValue(this);
    }

    public static class ByValue extends SocketStruct implements Structure.ByValue {
        public ByValue(SocketStruct s) {
            this.id = s.id;
        }
    }
}
